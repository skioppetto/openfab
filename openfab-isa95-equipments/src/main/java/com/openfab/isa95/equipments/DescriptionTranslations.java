package com.openfab.isa95.equipments;

import java.util.HashMap;
import java.util.Locale;
import java.util.Set;

public class DescriptionTranslations extends HashMap<String, String> {

	private static final long serialVersionUID = 1839442983200520483L;

	public DescriptionTranslations(){}
	
	public DescriptionTranslations(String text){
		put(Locale.getDefault().getLanguage(), text);
	}
	
	public String getDefaultText() {
		if (!keySet().isEmpty()) {
			if (1 == keySet().size()) {
				return values().iterator().next();
			} else {
				return get(Locale.getDefault().getLanguage());
			}
		}
		return null;
	}

	public String getTranslatedText(String language) {
		return get(language)!=null?get(language):getDefaultText();
	}

	public Set<String> getLanguages() {
		return keySet();
	}

}
