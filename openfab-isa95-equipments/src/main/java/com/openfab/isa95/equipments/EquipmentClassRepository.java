package com.openfab.isa95.equipments;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface EquipmentClassRepository extends
		CrudRepository<EquipmentClass, String>, EquipmentClassRepositoryCustom,
		QuerydslPredicateExecutor<EquipmentClass> {

	@Query(value="{}", fields="{'EquipmentProperties' : 0}")
	public Iterable<EquipmentClass> findSimpleAll();
}
