package com.openfab.isa95.equipments;

import java.util.List;
import java.util.Locale;

import lombok.Data;
import lombok.Getter;

import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
public class EquipmentProperty {
	/**
	 * optional to manage key/value pairs
	 * */
	private String key; 
	@Transient
	@Getter(onMethod_ = {@DescriptionLocalized(translationsField="descriptionTranslations"), @Transient})
	private String description;
	@JsonIgnore
	@Getter(onMethod_ = {@JsonIgnore})
	private DescriptionTranslations descriptionTranslations;
	private Value value;
	private List<Value> values;	
	private List<EquipmentProperty> properties;
	
	public EquipmentProperty(){}
	
	public EquipmentProperty(String key, String description, Value value) {
		super();
		this.key = key;
		this.descriptionTranslations = new DescriptionTranslations();
		this.descriptionTranslations.put(Locale.getDefault().getLanguage(), description);
		this.value = value;
	}
	
	public EquipmentProperty(String key, DescriptionTranslations translations, Value value) {
		super();
		this.key = key;
		this.descriptionTranslations = translations;		
		this.value = value;
	}
	
	// ISSUE #10: manage EquipmentCapabilityTestSpecificationID
	// ISSUE #11: manage TestResult
}
