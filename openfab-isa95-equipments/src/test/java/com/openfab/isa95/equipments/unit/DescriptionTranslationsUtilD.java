package com.openfab.isa95.equipments.unit;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class DescriptionTranslationsUtilD {

	private List<DescriptionTranslationsUtilA> translations;

	public DescriptionTranslationsUtilD() {
		translations = new ArrayList<DescriptionTranslationsUtilA>();
		for (int i = 0; i < 5; i++)
			translations.add(new DescriptionTranslationsUtilA());
	}

}
