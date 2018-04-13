package com.openfab.isa95.equipments.integration;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.openfab.isa95.equipments.DescriptionTranslations;
import com.openfab.isa95.equipments.EquipmentClass;
import com.openfab.isa95.equipments.EquipmentClassController;
import com.openfab.isa95.equipments.EquipmentClassRepository;
import com.openfab.isa95.equipments.EquipmentLevelEnum;
import com.openfab.isa95.equipments.Isa95EquipmentsApplication;

@RunWith(SpringRunner.class)
@WebMvcTest({ EquipmentClassController.class,
		EmbeddedMongoIntegrationConfig.class, Isa95EquipmentsApplication.class })
public class EquipmentClassIntegrationTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private EquipmentClassRepository repository;

	@Before
	public void setUp() {
		// enterprise node
		EquipmentClass root = new EquipmentClass();
		DescriptionTranslations descsroot = new DescriptionTranslations();
		descsroot.put("en", "my enterprise description");
		descsroot.put("it", "la mia descrizione");
		root.setDescriptions(descsroot);
		root.setID("root");
		root.setLevel(EquipmentLevelEnum.Enterprise);

		// area1 node
		EquipmentClass area1 = new EquipmentClass();
		DescriptionTranslations descsarea = new DescriptionTranslations();
		descsarea.put("en", "my area description");
		descsarea.put("it", "la mia descrizione area");
		area1.setDescriptions(descsarea);
		area1.setID("area1");
		area1.setLevel(EquipmentLevelEnum.Area);
		area1.setParentID("root");

		// area2 node
		EquipmentClass area2 = new EquipmentClass();
		DescriptionTranslations descsarea2 = new DescriptionTranslations();
		descsarea2.put("en", "my area description");
		descsarea2.put("it", "la mia descrizione area 2");
		area2.setDescriptions(descsarea2);
		area2.setID("area2");
		area2.setLevel(EquipmentLevelEnum.Area);
		area2.setParentID("root");

		List<EquipmentClass> equipments = new ArrayList<EquipmentClass>();
		equipments.add(root);
		equipments.add(area1);
		equipments.add(area2);
		Mockito.when(repository.findAll()).thenReturn(equipments);
	}

	@Test
	public void testTree() throws Exception {
		RequestBuilder getAll = MockMvcRequestBuilders.get("/equipment-class",
				MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(getAll).andReturn();
		Assert.assertNotNull(result.getResponse().getContentAsString());
		Assert.assertEquals(
				"{\"node\":{\"descriptions\":{\"en\":\"my enterprise description\",\"it\":\"la mia descrizione\"},\"id\":\"root\",\"level\":\"Enterprise\"},\"children\":[{\"node\":{\"descriptions\":{\"en\":\"my area description\",\"it\":\"la mia descrizione area\"},\"id\":\"area1\",\"level\":\"Area\",\"parentID\":\"root\"},\"children\":[]},{\"node\":{\"descriptions\":{\"en\":\"my area description\",\"it\":\"la mia descrizione area 2\"},\"id\":\"area2\",\"level\":\"Area\",\"parentID\":\"root\"},\"children\":[]}]}",
				result.getResponse().getContentAsString());

	}
}