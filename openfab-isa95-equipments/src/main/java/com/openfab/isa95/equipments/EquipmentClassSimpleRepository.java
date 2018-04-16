package com.openfab.isa95.equipments;

import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface EquipmentClassSimpleRepository extends
		CrudRepository<EquipmentClass, String>,
		QuerydslBinderCustomizer<QEquipmentClass> {

	@Override
	default void customize(QuerydslBindings bindings, QEquipmentClass root) {
		bindings.bind(root);
		bindings.excluding(root.EquipmentProperties);
	}

}
