package com.openfab.isa95.equipments;

import lombok.Data;

@Data
public class Value {	
	private String AsString;
	private DataTypeEnum Type;
	private String UnitOfMeasure;
	private String Key;
}
