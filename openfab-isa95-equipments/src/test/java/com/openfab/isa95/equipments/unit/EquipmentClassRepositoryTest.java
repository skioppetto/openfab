package com.openfab.isa95.equipments.unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.kirilldev.mongomery.MongoDBTester;
import com.mongodb.MongoClient;
import com.openfab.isa95.equipments.EquipmentClass;
import com.openfab.isa95.equipments.EquipmentClassRepository;
import com.openfab.isa95.equipments.EquipmentLevelEnum;
import com.openfab.isa95.equipments.Isa95EquipmentsApplication;
import com.openfab.isa95.equipments.commons.EmbeddedMongoIntegrationConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { EmbeddedMongoIntegrationConfig.class,
		Isa95EquipmentsApplication.class })
public class EquipmentClassRepositoryTest {

	@Autowired
	private MongoClient mongoClient;

	@Autowired
	private EquipmentClassRepository repo;

	@Before
	public void setUpDb() {
		MongoDBTester mongoDBTester = new MongoDBTester(
				mongoClient.getDB(EmbeddedMongoIntegrationConfig.DB_NAME));
		mongoDBTester.dropDataBase();
		mongoDBTester.setDBState("EquipmentClassRepositoryTest.json");
	}	

	@Test
	public void readByName() {
		Optional<EquipmentClass> root = repo.findByName("root");
		Assert.assertTrue(root.isPresent());
		Assert.assertEquals("root", root.get().getName());
		Assert.assertEquals(null, root.get().getParentID());
		Assert.assertEquals(EquipmentLevelEnum.Enterprise, root.get().getLevel());
		Assert.assertNotNull(root.get().getDescriptionTranslations());
		Assert.assertEquals("my enterprise description", root.get().getDescriptionTranslations().get("en"));
		Assert.assertEquals("la mia descrizione", root.get().getDescriptionTranslations().get("it"));
	}
	
	@Test
	public void readSimpleAll() {
		Iterable<EquipmentClass> all = repo.findSimpleAll();
		Assert.assertNotNull(all);
		List<EquipmentClass> allList = new ArrayList<EquipmentClass>();
		all.forEach(e -> allList.add(e));
		Assert.assertEquals(5, allList.size());
		Optional<EquipmentClass> root = allList.stream()
				.filter(e -> e.getName().equals("root")).findFirst();
		Assert.assertTrue(root.isPresent());
		Assert.assertNull(root.get().getExtended());
	}

	@Test
	public void readDetailedAll() {
		Iterable<EquipmentClass> all = repo.findAll();
		Assert.assertNotNull(all);
		List<EquipmentClass> allList = new ArrayList<EquipmentClass>();
		all.forEach(e -> allList.add(e));
		Assert.assertEquals(5, allList.size());
		Optional<EquipmentClass> root = allList.stream()
				.filter(e -> e.getName().equals("root")).findFirst();
		Assert.assertTrue(root.isPresent());
		Assert.assertNotNull(root.get().getExtended());
	}

	@Test
	public void createEquipmentClass() {
		EquipmentClass validProcessCell = new EquipmentClass();
		validProcessCell = new EquipmentClass();
		validProcessCell.setDescription("process cell 2");
		validProcessCell.setName("processCell2");
		validProcessCell.setParentID("area2");
		validProcessCell.setLevel(EquipmentLevelEnum.ProcessCell);
		EquipmentClass saved = repo.save(validProcessCell);
		Assert.assertNotNull(saved);
		Iterable<EquipmentClass> all = repo.findAll();
		Assert.assertNotNull(all);
		List<EquipmentClass> allList = new ArrayList<EquipmentClass>();
		all.forEach(e -> allList.add(e));
		Assert.assertEquals(6, allList.size());
	}

}
