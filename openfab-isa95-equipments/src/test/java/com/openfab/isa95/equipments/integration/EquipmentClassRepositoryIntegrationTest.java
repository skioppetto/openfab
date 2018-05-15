package com.openfab.isa95.equipments.integration;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mongodb.MongoClient;
import com.openfab.isa95.equipments.EquipmentClass;
import com.openfab.isa95.equipments.EquipmentClassRepository;
import com.openfab.isa95.equipments.EquipmentLevelEnum;
import com.openfab.isa95.equipments.Isa95EquipmentsApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { EmbeddedMongoIntegrationConfig.class,
		Isa95EquipmentsApplication.class,
		EquipmentClassRepositoryIntegrationTestConfig.class })
public class EquipmentClassRepositoryIntegrationTest {

	@Autowired
	private MongoClient mongoClient;

	@Autowired
	private EquipmentClassRepository repo;	
	
	@Test
	public void readSimple() {
		Iterable<EquipmentClass> all = repo.findSimpleAll();
		Assert.assertNotNull(all);
		List<EquipmentClass> allList = new ArrayList<EquipmentClass>();
		all.forEach(e -> allList.add(e));
		Assert.assertEquals(5, allList.size());
		Optional<EquipmentClass> root = allList.stream()
				.filter(e -> e.getId().equals("root")).findFirst();
		Assert.assertTrue(root.isPresent());
		Assert.assertNull(root.get().getExtended());
	}

	@Test
	public void readDetailed() {
		Iterable<EquipmentClass> all = repo.findAll();
		Assert.assertNotNull(all);
		List<EquipmentClass> allList = new ArrayList<EquipmentClass>();
		all.forEach(e -> allList.add(e));
		Assert.assertEquals(5, allList.size());
		Optional<EquipmentClass> root = allList.stream()
				.filter(e -> e.getId().equals("root")).findFirst();
		Assert.assertTrue(root.isPresent());
		Assert.assertNotNull(root.get().getExtended());
	}

	@Test
	public void testCreateEquipmentClass(){
		EquipmentClass validProcessCell = new EquipmentClass();
		validProcessCell = new EquipmentClass();
		validProcessCell.setDescription("process cell 2");
		validProcessCell.setId("processCell2");
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
