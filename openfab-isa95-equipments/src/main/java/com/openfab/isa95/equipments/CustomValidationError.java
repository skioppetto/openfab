package com.openfab.isa95.equipments;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomValidationError {

	private String property;
	private List<CustomValidationErrorProperty> errors;
	
}
