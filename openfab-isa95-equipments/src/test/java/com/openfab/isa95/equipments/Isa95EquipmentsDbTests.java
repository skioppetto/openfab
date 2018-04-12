package com.openfab.isa95.equipments;

import org.bson.BsonDocument;
import org.bson.BsonString;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mongodb.MongoClient;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { EmbeddedMongoJunitConfig.class,
		Isa95EquipmentsApplication.class })
public class Isa95EquipmentsDbTests {

	@Autowired
	private MongoClient mongoClient;
	
	@Test
	public void contextLoads() {
		String version = mongoClient.getDatabase("junit")
				.runCommand(new BsonDocument("buildinfo", new BsonString("")))
				.get("version").toString();
		Assert.assertEquals("3.6.2", version);
		
	}

}
