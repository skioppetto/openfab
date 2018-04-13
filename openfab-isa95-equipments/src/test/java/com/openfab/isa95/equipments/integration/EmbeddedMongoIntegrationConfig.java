package com.openfab.isa95.equipments.integration;

import java.io.IOException;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

import de.flapdoodle.embed.mongo.MongodExecutable;
import de.flapdoodle.embed.mongo.MongodProcess;
import de.flapdoodle.embed.mongo.MongodStarter;
import de.flapdoodle.embed.mongo.config.MongodConfigBuilder;
import de.flapdoodle.embed.mongo.config.Net;
import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.process.runtime.Network;

@Configuration
public class EmbeddedMongoIntegrationConfig {

	public static final String DB_NAME = "integration_tests";

	/**
	 * please store Starter or RuntimeConfig in a static final field if you want
	 * to use artifact store caching (or else disable caching)
	 */
	private static final MongodStarter starter = MongodStarter
			.getDefaultInstance();

	public MongodExecutable _mongodExe;

	private MongoClient _mongo;

	private MongodProcess _mongod;

	public EmbeddedMongoIntegrationConfig() throws Exception {
		_mongodExe = starter.prepare(new MongodConfigBuilder()
				.version(Version.Main.V3_6)
				.net(new Net("localhost", 12345, Network.localhostIsIPv6()))
				.build());
		_mongod = _mongodExe.start();

		_mongo = new MongoClient("localhost", 12345);

	}

	@Bean(name = "mongoClient")
	public MongoClient mongoClient() throws IOException {
		// Lots of calls here to de.flapdoodle.embed.mongo code base to
		// create an embedded db and insert some JSON data
		return _mongo;
	}

	@Bean(name = "mongodProcess")
	public MongodProcess mongodProcess() {
		return _mongod;
	}

	@Autowired
	@Bean(name = "mongoDbFactory")
	public MongoDbFactory mongoDbFactory(MongoClient mongoClient) {
		return new SimpleMongoDbFactory(mongoClient, DB_NAME);
	}

	@Autowired
	@Bean(name = "mongoTemplate")
	public MongoTemplate mongoTemplate(MongoClient mongoClient) {
		return new MongoTemplate(mongoClient, DB_NAME);
	}

	@PreDestroy
	public void shutdownEmbeddedMongoDB() {
		_mongodExe.stop();
	}
}
