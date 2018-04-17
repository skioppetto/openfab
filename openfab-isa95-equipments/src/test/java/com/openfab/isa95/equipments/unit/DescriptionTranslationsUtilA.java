
package com.openfab.isa95.equipments.unit;

import com.openfab.isa95.equipments.DescriptionLocalized;
import com.openfab.isa95.equipments.DescriptionTranslations;

import lombok.Data;
import lombok.Getter;

@Data
public class DescriptionTranslationsUtilA {

	@Getter(onMethod_ = @DescriptionLocalized(translationsField = "descriptionTranslated"))
	private String description;

	private DescriptionTranslations descriptionTranslated = new DescriptionTranslations() {
		private static final long serialVersionUID = 1L;
		{
			put("it", "italian description");
			put("en", "english description");
			put("de", "german description");
		}
	};
}
