package com.openfab.isa95.equipments.integration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.openfab.isa95.equipments.CommonsController;
import com.openfab.isa95.equipments.Isa95EquipmentsApplication;
import com.openfab.isa95.equipments.commons.EmbeddedMongoIntegrationConfig;

@RunWith(SpringRunner.class)
@WebMvcTest({ CommonsController.class, EmbeddedMongoIntegrationConfig.class,
		Isa95EquipmentsApplication.class })
public class CommonsRestIntegrationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testDataTypes() throws Exception {
		RequestBuilder dataTypes = MockMvcRequestBuilders.get(
				"/commons/data-type", MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(dataTypes).andReturn();
		Assert.assertNotNull(result.getResponse().getContentAsString(), result
				.getResponse().getContentAsString());
		System.out.println("----- dataTypes() result: "
				+ result.getResponse().getContentAsString());
		String expected = "[\"Amount\",\"BinaryObject\",\"Code\",\"DateTime\",\"Identifier\",\"Indicator\",\"Measure\",\"Numeric\",\"Quantity\",\"Text\"]";
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), true);
	}
}
