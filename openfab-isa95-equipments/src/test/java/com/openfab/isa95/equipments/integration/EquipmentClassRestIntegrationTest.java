package com.openfab.isa95.equipments.integration;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
public class EquipmentClassRestIntegrationTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private EquipmentClassRepository repo;

	@Before
	public void setUp() {
		// enterprise node
		EquipmentClass root = new EquipmentClass();
		DescriptionTranslations descsroot = new DescriptionTranslations();
		descsroot.put("en", "my enterprise description");
		descsroot.put("it", "la mia descrizione");
		root.setDescriptions(descsroot);
		root.setId("root");
		root.setLevel(EquipmentLevelEnum.Enterprise);

		// area1 node
		EquipmentClass area1 = new EquipmentClass();
		DescriptionTranslations descsarea = new DescriptionTranslations();
		descsarea.put("en", "my area description");
		descsarea.put("it", "la mia descrizione area");
		area1.setDescriptions(descsarea);
		area1.setId("area1");
		area1.setLevel(EquipmentLevelEnum.Area);
		area1.setParentID("root");

		// area2 node
		EquipmentClass area2 = new EquipmentClass();
		DescriptionTranslations descsarea2 = new DescriptionTranslations();
		descsarea2.put("en", "my area description");
		descsarea2.put("it", "la mia descrizione area 2");
		area2.setDescriptions(descsarea2);
		area2.setId("area2");
		area2.setLevel(EquipmentLevelEnum.Area);
		area2.setParentID("root");

		List<EquipmentClass> equipments = new ArrayList<EquipmentClass>();
		equipments.add(root);
		equipments.add(area1);
		equipments.add(area2);
		Mockito.when(repo.findSimpleAll()).thenReturn(equipments);
		Mockito.when(repo.findById(Mockito.eq("root"))).thenReturn(
				Optional.of(root));
		Mockito.when(repo.findById(Mockito.eq("area1"))).thenReturn(
				Optional.of(area1));
		Mockito.when(repo.findById(Mockito.eq("area2"))).thenReturn(
				Optional.of(area2));
	}

	@Test
	public void testTree() throws Exception {
		RequestBuilder getAll = MockMvcRequestBuilders.get("/equipment-class",
				MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(getAll).andReturn();
		Assert.assertNotNull(result.getResponse().getContentAsString(), result
				.getResponse().getContentAsString());
		System.out.println(result.getResponse().getContentAsString());

	}

	@Test
	public void testGetOK() throws Exception {
		RequestBuilder getAll = MockMvcRequestBuilders.get(
				"/equipment-class/root", MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(getAll).andReturn();
		Assert.assertNotNull(result.getResponse().getContentAsString(), result
				.getResponse().getContentAsString());
		System.out.println(result.getResponse().getContentAsString());

	}

	@Test
	public void testGet404() throws Exception {
		RequestBuilder getAll = MockMvcRequestBuilders.get(
				"/equipment-class/404", MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(getAll).andReturn();
		Assert.assertNotNull(result.getResponse());
		Assert.assertEquals(404, result.getResponse().getStatus());
		System.out.println(result.getResponse().getContentAsString());

	}
}
