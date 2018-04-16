package com.openfab.isa95.equipments;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = { "id" })
public abstract class AbstractEquipment {

	private String id;
	private EquipmentLevelEnum Level;
	private DescriptionTranslations descriptions;
	private List<EquipmentProperty> equipmentProperties;
	/**
	 * * HierarchyScopeType in B2MML 	
	 */
	private String parentID;
	// ISSUE #10: add EquipmentCapabilityTestSpecifications

	public AbstractEquipment() {
		super();
	}

}