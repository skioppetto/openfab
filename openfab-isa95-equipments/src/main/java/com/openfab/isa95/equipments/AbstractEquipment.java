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

	// ISSUE #4: manage multiple languages in Description field
	// ISSUE #10: add EquipmentCapabilityTestSpecifications

	public AbstractEquipment() {
		super();
	}

}