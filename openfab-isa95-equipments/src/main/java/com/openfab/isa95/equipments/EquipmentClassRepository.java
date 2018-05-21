package com.openfab.isa95.equipments;

import java.util.Optional;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface EquipmentClassRepository extends
		CrudRepository<EquipmentClass, String>, EquipmentClassRepositoryCustom,
		QuerydslPredicateExecutor<EquipmentClass> {

	@Query(value="{}", fields="{'extended' : 0}")
	public Iterable<EquipmentClass> findSimpleAll();

	public Optional<EquipmentClass> findByName(String id);
}
