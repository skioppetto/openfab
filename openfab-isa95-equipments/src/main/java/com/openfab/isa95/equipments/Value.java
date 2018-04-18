package com.openfab.isa95.equipments;

import lombok.Data;

@Data
public class Value {
	private String AsString;
	private DataTypeEnum Type;
	private String UnitOfMeasure;
	private String Key;

	public Value() {
	}

	public Value(String asString, DataTypeEnum type) {
		super();
		AsString = asString;
		Type = type;
	}

}
