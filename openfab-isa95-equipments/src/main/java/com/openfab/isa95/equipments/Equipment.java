package com.openfab.isa95.equipments;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class Equipment extends AbstractEquipment {
	
	private List<EquipmentClass> Classes;
	
}
