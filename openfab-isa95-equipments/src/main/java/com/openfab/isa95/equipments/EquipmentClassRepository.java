package com.openfab.isa95.equipments;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EquipmentClassRepository extends
		MongoRepository<EquipmentClass, String> {

//	@Query(fields = "{'ID', 'Level', 'Descriptions', 'ParentID' }")
//	public List<EquipmentClass> findAll();

}
