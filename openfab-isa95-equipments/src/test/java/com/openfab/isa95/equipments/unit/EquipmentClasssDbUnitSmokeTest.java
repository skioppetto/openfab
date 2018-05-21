package com.openfab.isa95.equipments.unit;

import org.bson.BsonDocument;
import org.bson.BsonString;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.kirilldev.mongomery.MongoDBTester;
import com.mongodb.MongoClient;
import com.openfab.isa95.equipments.Isa95EquipmentsApplication;
import com.openfab.isa95.equipments.commons.EmbeddedMongoIntegrationConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { EmbeddedMongoIntegrationConfig.class,
		Isa95EquipmentsApplication.class })
public class EquipmentClasssDbUnitSmokeTest {

	@Autowired
	private MongoClient mongoClient;
	
	@Test
	public void contextLoads() {
		String version = mongoClient.getDatabase(EmbeddedMongoIntegrationConfig.DB_NAME)
				.runCommand(new BsonDocument("buildinfo", new BsonString("")))
				.get("version").toString();
		Assert.assertEquals("3.6.2", version);	
	}
	
	@Test
	public void dbFileLoad(){
		MongoDBTester mongoDBTester = new MongoDBTester(mongoClient.getDB(EmbeddedMongoIntegrationConfig.DB_NAME));
		mongoDBTester.setDBState("EquipmentClassRepositoryTest.json");		
	}

}
