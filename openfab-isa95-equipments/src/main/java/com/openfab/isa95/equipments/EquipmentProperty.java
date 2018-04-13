package com.openfab.isa95.equipments;

import java.util.List;

import lombok.Data;

@Data
public class EquipmentProperty {
	/**
	 * optional to manage key/value pairs
	 * */
	private String Key; 
	private String Description;
	private Value Value;
	private List<Value> Values;	
	List<EquipmentProperty> Properties;
	// ISSUE #10: manage EquipmentCapabilityTestSpecificationID
	// ISSUE #11: manage TestResult
}
