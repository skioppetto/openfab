package com.openfab.isa95.equipments;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;

// as defined on B2MML-V0600-Common EquipmentElementLevel1Type
public enum EquipmentLevelEnum {

	Enterprise(), Site("Enterprise"), Area("Site"), ProcessCell("Area"), Unit(
			"ProcessCell", "ProductionUnit"), ProductionLine("Area"), WorkCell(
			"ProductionLine"), ProductionUnit("Area"), StorageZone("Area"), StorageUnit(
			"StorageZone"), WorkCenter("Area"), WorkUnit("WorkCenter"),

	/** ISA 88 Batch Control */
	EquipmentModule("Unit", "EquipmentModule"), ControlModule(
			"EquipmentModule", "ControlModule");

	private List<String> parentLevels;

	private EquipmentLevelEnum(String... parents) {
		parentLevels = Arrays.nonNullElementsIn(parents);
	}

	private EquipmentLevelEnum() {

	}

	public List<EquipmentLevelEnum> getParents() {
		if (null == parentLevels)
			return null;
		List<EquipmentLevelEnum> retValues = new ArrayList<EquipmentLevelEnum>();
		parentLevels.forEach(p -> retValues.add(EquipmentLevelEnum.valueOf(p)));
		return retValues;
	}
}
