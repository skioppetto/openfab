package com.openfab.isa95.equipments.integration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.openfab.isa95.equipments.DataTypeEnum;
import com.openfab.isa95.equipments.DescriptionTranslations;
import com.openfab.isa95.equipments.EquipmentClass;
import com.openfab.isa95.equipments.EquipmentClassController;
import com.openfab.isa95.equipments.EquipmentClassRepository;
import com.openfab.isa95.equipments.EquipmentLevelEnum;
import com.openfab.isa95.equipments.EquipmentProperty;
import com.openfab.isa95.equipments.Isa95EquipmentsApplication;
import com.openfab.isa95.equipments.Value;

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
		root.setDescriptionTranslations(descsroot);
		root.setId("root");
		root.setLevel(EquipmentLevelEnum.Enterprise);

		// enterprise node detailed
		EquipmentClass rootdetailed = new EquipmentClass();
		DescriptionTranslations descsrootdetailed = new DescriptionTranslations();
		descsrootdetailed.put("en", "my enterprise description");
		descsrootdetailed.put("it", "la mia descrizione");
		rootdetailed.setDescriptionTranslations(descsrootdetailed);
		rootdetailed.setId("root");
		rootdetailed.setLevel(EquipmentLevelEnum.Enterprise);
		DescriptionTranslations addressTranslations = new DescriptionTranslations();
		addressTranslations.put(Locale.getDefault().getLanguage(), "enterprise address");
		addressTranslations.put(Locale.ITALIAN.getLanguage(), "indirizzo azienda");
		List<EquipmentProperty> propertiesroot = Arrays
				.asList(new EquipmentProperty("address", addressTranslations,
						new Value("via gorizia, 12, Napoli", DataTypeEnum.Text)),
						new EquipmentProperty("name", "enterprise name",
								new Value("Ablabla s.p.a", DataTypeEnum.Text)));
		rootdetailed.setEquipmentProperties(propertiesroot);

		// area1 node
		EquipmentClass area1 = new EquipmentClass();
		DescriptionTranslations descsarea = new DescriptionTranslations();
		descsarea.put("en", "my area description");
		descsarea.put("it", "la mia descrizione area");
		area1.setDescriptionTranslations(descsarea);
		area1.setId("area1");
		area1.setLevel(EquipmentLevelEnum.Area);
		area1.setParentID("root");

		// area2 node
		EquipmentClass area2 = new EquipmentClass();
		DescriptionTranslations descsarea2 = new DescriptionTranslations();
		descsarea2.put("en", "my area description");
		descsarea2.put("it", "la mia descrizione area 2");
		area2.setDescriptionTranslations(descsarea2);
		area2.setId("area2");
		area2.setLevel(EquipmentLevelEnum.Area);
		area2.setParentID("root");

		List<EquipmentClass> equipments = new ArrayList<EquipmentClass>();
		equipments.add(root);
		equipments.add(area1);
		equipments.add(area2);
		Mockito.when(repo.findSimpleAll()).thenReturn(equipments);
		Mockito.when(repo.findById(Mockito.eq("root"))).thenReturn(
				Optional.of(rootdetailed));
	}

	@Test
	public void testTree() throws Exception {
		RequestBuilder getAll = MockMvcRequestBuilders.get("/equipment-class",
				MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(getAll).andReturn();
		Assert.assertNotNull(result.getResponse().getContentAsString(), result
				.getResponse().getContentAsString());
		System.out.println("----- testTree() result: "
				+ result.getResponse().getContentAsString());
		String expected = "{\"node\":{\"id\":\"root\",\"description\":\"my enterprise description\",\"level\":\"Enterprise\"},\"children\":[{\"node\":{\"id\":\"area1\",\"description\":\"my area description\",\"parentID\":\"root\",\"level\":\"Area\"}},{\"node\":{\"id\":\"area2\",\"description\":\"my area description\",\"parentID\":\"root\",\"level\":\"Area\"}}]}";
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), true);
	}
	
	@Test
	public void testTreeLanguage() throws Exception {
		RequestBuilder getAll = MockMvcRequestBuilders.get("/equipment-class?lang=it",
				MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(getAll).andReturn();
		Assert.assertNotNull(result.getResponse().getContentAsString(), result
				.getResponse().getContentAsString());
		System.out.println("----- testTree() result: "
				+ result.getResponse().getContentAsString());
		String expected = "{\"node\":{\"id\":\"root\",\"description\":\"la mia descrizione\",\"level\":\"Enterprise\"},\"children\":[{\"node\":{\"id\":\"area1\",\"description\":\"la mia descrizione area\",\"parentID\":\"root\",\"level\":\"Area\"}},{\"node\":{\"id\":\"area2\",\"description\":\"la mia descrizione area 2\",\"parentID\":\"root\",\"level\":\"Area\"}}]}";
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), true);
	}

	@Test
	public void testGetDetailedOK() throws Exception {
		RequestBuilder getAll = MockMvcRequestBuilders.get(
				"/equipment-class/root", MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(getAll).andReturn();
		Assert.assertNotNull(result.getResponse().getContentAsString(), result
				.getResponse().getContentAsString());
		System.out.println("----- testGetOK() result: "
				+ result.getResponse().getContentAsString());
		String expected = "{\"id\":\"root\",\"equipmentProperties\":[{\"key\":\"address\",\"description\":\"enterprise address\",\"value\":{\"type\":\"Text\",\"asString\":\"via gorizia, 12, Napoli\"}},{\"key\":\"name\",\"description\":\"enterprise name\",\"value\":{\"type\":\"Text\",\"asString\":\"Ablabla s.p.a\"}}],\"level\":\"Enterprise\"}";
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);
	}
	
	@Test
	public void testGetDetailedOKLanguage() throws Exception {
		RequestBuilder getAll = MockMvcRequestBuilders.get(
				"/equipment-class/root?lang=it", MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(getAll).andReturn();
		Assert.assertNotNull(result.getResponse().getContentAsString(), result
				.getResponse().getContentAsString());
		System.out.println("----- testGetOKLanguage() result: "
				+ result.getResponse().getContentAsString());
		String expected = "{\"id\":\"root\",\"equipmentProperties\":[{\"key\":\"address\",\"description\":\"indirizzo azienda\",\"value\":{\"type\":\"Text\",\"asString\":\"via gorizia, 12, Napoli\"}},{\"key\":\"name\",\"description\":\"enterprise name\",\"value\":{\"type\":\"Text\",\"asString\":\"Ablabla s.p.a\"}}],\"level\":\"Enterprise\"}";
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);
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
