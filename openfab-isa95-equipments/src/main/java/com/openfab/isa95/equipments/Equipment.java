package com.openfab.isa95.equipments;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class Equipment extends AbstractEquipment {

	/**
	 * * HierarchyScopeType in B2MML 	
	 */
	private String ParentEquipmentID;
	/**
	 * * HierarchyScopeType in B2MML 	
	 */
	private List<String> ChildrenEquipmentIDs;
	private List<EquipmentClass> Classes;
	
}
