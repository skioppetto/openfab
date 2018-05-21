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
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.openfab.isa95.equipments.DataTypeEnum;
import com.openfab.isa95.equipments.DescriptionTranslations;
import com.openfab.isa95.equipments.EquipmentClass;
import com.openfab.isa95.equipments.EquipmentClassController;
import com.openfab.isa95.equipments.EquipmentClassRepository;
import com.openfab.isa95.equipments.EquipmentClassValidator;
import com.openfab.isa95.equipments.EquipmentLevelEnum;
import com.openfab.isa95.equipments.EquipmentProperty;
import com.openfab.isa95.equipments.Isa95EquipmentsApplication;
import com.openfab.isa95.equipments.CustomResponseEntityExceptionHandler;
import com.openfab.isa95.equipments.Value;
import com.openfab.isa95.equipments.commons.EmbeddedMongoIntegrationConfig;

@RunWith(SpringRunner.class)
@WebMvcTest({ EquipmentClassController.class, EquipmentClassValidator.class,
		EmbeddedMongoIntegrationConfig.class, Isa95EquipmentsApplication.class,
		CustomResponseEntityExceptionHandler.class })
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
		root.setName("root");
		root.setLevel(EquipmentLevelEnum.Enterprise);

		// enterprise node detailed
		EquipmentClass rootdetailed = new EquipmentClass();
		DescriptionTranslations descsrootdetailed = new DescriptionTranslations();
		descsrootdetailed.put("en", "my enterprise description");
		descsrootdetailed.put("it", "la mia descrizione");
		rootdetailed.setDescriptionTranslations(descsrootdetailed);
		rootdetailed.setName("root");
		rootdetailed.setLevel(EquipmentLevelEnum.Enterprise);
		DescriptionTranslations addressTranslations = new DescriptionTranslations();
		addressTranslations.put(Locale.getDefault().getLanguage(),
				"enterprise address");
		addressTranslations.put(Locale.ITALIAN.getLanguage(),
				"indirizzo azienda");
		List<EquipmentProperty> propertiesroot = Arrays
				.asList(new EquipmentProperty("address", addressTranslations,
						new Value("via gorizia, 12, Napoli", DataTypeEnum.Text)),
						new EquipmentProperty("name", "enterprise name",
								new Value("Ablabla s.p.a", DataTypeEnum.Text)));
		rootdetailed.setExtended(propertiesroot);

		// area1 node
		EquipmentClass area1 = new EquipmentClass();
		DescriptionTranslations descsarea = new DescriptionTranslations();
		descsarea.put("en", "my area description");
		descsarea.put("it", "la mia descrizione area");
		area1.setDescriptionTranslations(descsarea);
		area1.setName("area1");
		area1.setLevel(EquipmentLevelEnum.Area);
		area1.setParentID("root");

		// area2 node
		EquipmentClass area2 = new EquipmentClass();
		DescriptionTranslations descsarea2 = new DescriptionTranslations();
		descsarea2.put("en", "my area description");
		descsarea2.put("it", "la mia descrizione area 2");
		area2.setDescriptionTranslations(descsarea2);
		area2.setName("area2");
		area2.setLevel(EquipmentLevelEnum.Area);
		area2.setParentID("root");

		// processCell1 node
		EquipmentClass processCell1 = new EquipmentClass();
		DescriptionTranslations descprocessCell1 = new DescriptionTranslations();
		descprocessCell1.put("en", "my process cell");
		descprocessCell1.put("it", "la mia cella di processo 1");
		processCell1.setDescriptionTranslations(descprocessCell1);
		processCell1.setName("area2");
		processCell1.setLevel(EquipmentLevelEnum.ProcessCell);
		processCell1.setParentID("area2");

		List<EquipmentClass> equipments = new ArrayList<EquipmentClass>();
		equipments.add(root);
		equipments.add(area1);
		equipments.add(area2);
		equipments.add(processCell1);
		Mockito.when(repo.findSimpleAll()).thenReturn(equipments);
		Mockito.when(repo.findByName(Mockito.eq("root"))).thenReturn(
				Optional.of(rootdetailed));
		Mockito.when(repo.save(Mockito.any(EquipmentClass.class))).thenAnswer(new Answer<EquipmentClass>() {
		    @Override
		    public EquipmentClass answer(InvocationOnMock invocation) throws Throwable {
		      Object[] args = invocation.getArguments();
		      return (EquipmentClass) args[0];
		    }
		  });
		
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
		String expected = "{\"node\":{\"name\":\"root\",\"description\":\"my enterprise description\",\"level\":\"Enterprise\"},\"children\":[{\"node\":{\"name\":\"area1\",\"description\":\"my area description\",\"parentID\":\"root\",\"level\":\"Area\"}},{\"node\":{\"name\":\"area2\",\"description\":\"my area description\",\"parentID\":\"root\",\"level\":\"Area\"}}]}";
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), true);
	}

	@Test
	public void testTreeLanguage() throws Exception {
		RequestBuilder getAll = MockMvcRequestBuilders.get(
				"/equipment-class?lang=it", MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(getAll).andReturn();
		Assert.assertNotNull(result.getResponse().getContentAsString(), result
				.getResponse().getContentAsString());
		System.out.println("----- testTree() result: "
				+ result.getResponse().getContentAsString());
		String expected = "{\"node\":{\"name\":\"root\",\"description\":\"la mia descrizione\",\"level\":\"Enterprise\"},\"children\":[{\"node\":{\"name\":\"area1\",\"description\":\"la mia descrizione area\",\"parentID\":\"root\",\"level\":\"Area\"}},{\"node\":{\"name\":\"area2\",\"description\":\"la mia descrizione area 2\",\"parentID\":\"root\",\"level\":\"Area\"}}]}";
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
		String expected = "{\"name\":\"root\",\"description\":\"my enterprise description\",\"extended\":[{\"key\":\"address\",\"description\":\"enterprise address\",\"value\":{\"type\":\"Text\",\"asString\":\"via gorizia, 12, Napoli\"}},{\"key\":\"name\",\"description\":\"enterprise name\",\"value\":{\"type\":\"Text\",\"asString\":\"Ablabla s.p.a\"}}],\"level\":\"Enterprise\"}";
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
		String expected = "{\"name\":\"root\",\"description\":\"la mia descrizione\",\"extended\":[{\"key\":\"address\",\"description\":\"indirizzo azienda\",\"value\":{\"type\":\"Text\",\"asString\":\"via gorizia, 12, Napoli\"}},{\"key\":\"name\",\"description\":\"enterprise name\",\"value\":{\"type\":\"Text\",\"asString\":\"Ablabla s.p.a\"}}],\"level\":\"Enterprise\"}";
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);
	}

	@Test
	public void testGetTranslationsOK() throws Exception {
		RequestBuilder getAll = MockMvcRequestBuilders.get(
				"/equipment-class/root/translations",
				MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(getAll).andReturn();
		Assert.assertNotNull(result.getResponse().getContentAsString(), result
				.getResponse().getContentAsString());
		System.out.println("----- testGetTranslationsOK() result: "
				+ result.getResponse().getContentAsString());
		String expected = "{\"en\":\"my enterprise description\",\"it\":\"la mia descrizione\"}";
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);
	}

	@Test
	public void testGetEquipmentPropertiesOK() throws Exception {
		RequestBuilder getAll = MockMvcRequestBuilders.get(
				"/equipment-class/root/extended", MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(getAll).andReturn();
		Assert.assertNotNull(result.getResponse().getContentAsString(), result
				.getResponse().getContentAsString());
		System.out.println("----- testGetEquipmentPropertiesOK() result: "
				+ result.getResponse().getContentAsString());
		String expected = "[{\"key\":\"address\",\"value\":{\"type\":\"Text\",\"asString\":\"via gorizia, 12, Napoli\"}},{\"key\":\"name\",\"value\":{\"type\":\"Text\",\"asString\":\"Ablabla s.p.a\"}}]";
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);
	}

	@Test
	public void testGetPropertyTranslationsOK() throws Exception {
		RequestBuilder getAll = MockMvcRequestBuilders.get(
				"/equipment-class/root/extended/address/translations",
				MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(getAll).andReturn();
		Assert.assertNotNull(result.getResponse().getContentAsString(), result
				.getResponse().getContentAsString());
		System.out.println("----- testGetTranslationsOK() result: "
				+ result.getResponse().getContentAsString());
		String expected = "{\"en\":\"enterprise address\",\"it\":\"indirizzo azienda\"}";
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);
	}

	@Test
	public void testPostEquipmentClass() throws Exception {
		MockHttpServletRequestBuilder getAll = MockMvcRequestBuilders
				.post("/equipment-class")
				.content(
						"{\"name\":\"area4\",\"description\":\"my area4 description\", \"parentID\":\"root\", \"level\":\"Area\"}")
				.contentType(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(getAll).andReturn();
		System.out.println("----- testPostEquipmentClass() result: "
				+ result.getResponse().getContentAsString());
		Assert.assertEquals(HttpStatus.CREATED.value(), result.getResponse().getStatus());
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
