package com.openfab.isa95.equipments;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface EquipmentClassRepository extends
		MongoRepository<EquipmentClass, String> {

	@Query(fields = "{'ID', 'Level', 'Descriptions', 'ParentID' }")
	public List<EquipmentClass> findAll();

}
