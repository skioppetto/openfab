package com.openfab.isa95.equipments;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = { "ID" })
public class AbstractEquipment {

	private String ID;
	private EquipmentLevelEnum Level;
	private DescriptionTranslations Descriptions;
	private List<EquipmentProperty> EquipmentProperties;
	/**
	 * * HierarchyScopeType in B2MML 	
	 */
	private String ParentID;
	// ISSUE #10: add EquipmentCapabilityTestSpecifications

	public AbstractEquipment() {
		super();
	}

}