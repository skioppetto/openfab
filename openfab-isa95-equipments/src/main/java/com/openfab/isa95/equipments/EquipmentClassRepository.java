package com.openfab.isa95.equipments;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface EquipmentClassRepository extends
		CrudRepository<EquipmentClass, String>, 
		QuerydslPredicateExecutor<EquipmentClass>,
		EquipmentClassRepositoryCustom {

	
	
}
