package com.openfab.isa95.equipments.integration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CommonsRestIntegrationTest {

	@Autowired
	private TestRestTemplate mockMvc;

	@LocalServerPort
	private int port;

	@Test
	public void testDataTypes() throws Exception {
		String result = mockMvc.getForObject("http://localhost:" + port
				+ "/commons/data-type", String.class);
		Assert.assertNotNull(result);
		System.out.println("----- dataTypes() result: "
				+ result);
		String expected = "[\"Amount\",\"BinaryObject\",\"Code\",\"DateTime\",\"Identifier\",\"Indicator\",\"Measure\",\"Numeric\",\"Quantity\",\"Text\"]";
		JSONAssert.assertEquals(expected, result, true);
	}
}
