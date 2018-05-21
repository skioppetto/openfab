package com.openfab.isa95.equipments.unit;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.Errors;
import org.springframework.validation.MapBindingResult;

import com.openfab.isa95.equipments.EquipmentClass;
import com.openfab.isa95.equipments.EquipmentClassRepository;
import com.openfab.isa95.equipments.EquipmentClassValidator;
import com.openfab.isa95.equipments.EquipmentLevelEnum;
import com.openfab.isa95.equipments.Isa95EquipmentsApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Isa95EquipmentsApplication.class })
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class EquipmentClassValidatorTest {

	@MockBean
	private EquipmentClassRepository repo;

	@Autowired
	private EquipmentClassValidator validator;

	private Errors errors = null;

	@Before
	public void setUpErrors() {
		Map<String, String> map = new HashMap<String, String>();
		errors = new MapBindingResult(map, "equipmentClass");

		EquipmentClass validRoot = new EquipmentClass();
		validRoot = new EquipmentClass();
		validRoot.setDescription("root node");
		validRoot.setName("root");
		validRoot.setParentID(null);
		validRoot.setLevel(EquipmentLevelEnum.Enterprise);
		
		EquipmentClass validSite = new EquipmentClass();
		validSite = new EquipmentClass();
		validSite.setDescription("site node");
		validSite.setName("site");
		validSite.setParentID("root");
		validSite.setLevel(EquipmentLevelEnum.Site);
		
		Mockito.when(repo.findById(Mockito.anyString())).thenReturn(Optional.empty());
		Mockito.when(repo.findById(Mockito.matches("root")))
		.thenReturn(Optional.of(validRoot));
		Mockito.when(repo.findById(Mockito.matches("site")))
		.thenReturn(Optional.of(validSite));
	}
	
	@Test
	public void testValidRoot() {
		EquipmentClass validRoot = new EquipmentClass();
		validRoot = new EquipmentClass();
		validRoot.setDescription("root node");
		validRoot.setName("root");
		validRoot.setParentID(null);
		validRoot.setLevel(EquipmentLevelEnum.Enterprise);
		validator.validate(validRoot, errors);
		Assert.assertTrue(errors.getFieldErrors().isEmpty());
	}
	
	@Test
	// when level is a root level parentId should be null
	public void testInvalidRoot() {
		EquipmentClass validRoot = new EquipmentClass();
		validRoot = new EquipmentClass();
		validRoot.setDescription("root node");
		validRoot.setName("root");
		validRoot.setParentID("parent");
		validRoot.setLevel(EquipmentLevelEnum.Enterprise);
		validator.validate(validRoot, errors);
		Assert.assertFalse(errors.getFieldErrors().isEmpty());
		Assert.assertTrue(errors.getFieldErrors().stream()
				.anyMatch(el -> el.getCode().equals("parentID.not_null")));
	}

	@Test
	public void testInvalidNodeParentIDNull() {
		EquipmentClass invalidRoot = new EquipmentClass();
		invalidRoot = new EquipmentClass();
		invalidRoot.setDescription("root node");
		invalidRoot.setName("root");
		invalidRoot.setParentID(null);
		invalidRoot.setLevel(EquipmentLevelEnum.Area);
		validator.validate(invalidRoot, errors);
		Assert.assertFalse(errors.getFieldErrors().isEmpty());
		Assert.assertEquals(1, errors.getErrorCount());
		Assert.assertTrue(errors.getFieldErrors().stream()
				.anyMatch(el -> el.getCode().equals("parentID.null")));
	}
	
	@Test
	public void testInvalidNodeParentIDBlank() {
		EquipmentClass invalidRoot = new EquipmentClass();
		invalidRoot = new EquipmentClass();
		invalidRoot.setDescription("root node");
		invalidRoot.setName("root");
		invalidRoot.setParentID("  ");
		invalidRoot.setLevel(EquipmentLevelEnum.Area);
		validator.validate(invalidRoot, errors);
		Assert.assertFalse(errors.getFieldErrors().isEmpty());
		Assert.assertEquals(1, errors.getErrorCount());
		Assert.assertTrue(errors.getFieldErrors().stream()
				.anyMatch(el -> el.getCode().equals("parentID.blank")));
	}
	
	@Test
	public void testInvalidNodeParentIDNotExists() {
		EquipmentClass invalidNode = new EquipmentClass();
		invalidNode = new EquipmentClass();
		invalidNode.setDescription("area node");
		invalidNode.setName("area");
		invalidNode.setParentID("nodenotExists");
		invalidNode.setLevel(EquipmentLevelEnum.Area);
		validator.validate(invalidNode, errors);
		Assert.assertFalse(errors.getFieldErrors().isEmpty());
		Assert.assertEquals(1, errors.getErrorCount());
		Assert.assertTrue(errors.getFieldErrors().stream()
				.anyMatch(el -> el.getCode().equals("parentID.not_found")));
	}
	
	@Test
	public void testInvalidNodeWrongParent() {
		EquipmentClass invalidNode = new EquipmentClass();
		invalidNode = new EquipmentClass();
		invalidNode.setDescription("area node");
		invalidNode.setName("area");
		invalidNode.setParentID("root");
		invalidNode.setLevel(EquipmentLevelEnum.Area);
		validator.validate(invalidNode, errors);
		Assert.assertFalse(errors.getFieldErrors().isEmpty());
		Assert.assertEquals(1, errors.getErrorCount());
		Assert.assertTrue(errors.getFieldErrors().stream()
				.anyMatch(el -> el.getCode().equals("parentID.wrong")));
	}
	
	@Test
	public void testValidNode() {
		EquipmentClass invalidNode = new EquipmentClass();
		invalidNode = new EquipmentClass();
		invalidNode.setDescription("area node");
		invalidNode.setName("area");
		invalidNode.setParentID("site");
		invalidNode.setLevel(EquipmentLevelEnum.Area);
		validator.validate(invalidNode, errors);
		Assert.assertTrue(errors.getFieldErrors().isEmpty());		
	}

}
