package com.openfab.isa95.equipments.integration;

import org.springframework.context.annotation.Bean;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

public class EquipmentClassRepositoryIntegrationTestConfig {

	@Bean
	public Jackson2RepositoryPopulatorFactoryBean repositoryPopulator() {

		ClassLoader classLoader = getClass().getClassLoader();
		InputStreamResource r = new InputStreamResource(
				classLoader
						.getResourceAsStream("EquipmentClassRepositoryIntegration.json"));
		Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
		factory.setResources(new Resource[] { r });
		return factory;
	}

}
