package com.openfab.isa95.equipments;

import java.util.List;

import lombok.Data;

@Data
public class EquipmentProperty {
	/**
	 * optional to manage key/value pairs
	 * */
	private String key; 
	private String description;
	private Value value;
	private List<Value> values;	
	List<EquipmentProperty> properties;
	
	public EquipmentProperty(){}
	
	public EquipmentProperty(String key, String description, Value value) {
		super();
		this.key = key;
		this.description = description;
		this.value = value;
	}
	
	// ISSUE #10: manage EquipmentCapabilityTestSpecificationID
	// ISSUE #11: manage TestResult
}
