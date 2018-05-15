package com.openfab.isa95.equipments;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Data
@EqualsAndHashCode(of = { "id" })
public abstract class AbstractEquipment {

	@NotNull
	@NotBlank
	private String id;
	@NotNull
	private EquipmentLevelEnum Level;
	@Getter(onMethod_ =  {@DescriptionLocalized(translationsField = "descriptionTranslations"), @Transient })
	@Transient
	@NotNull
	@NotBlank
	private String description;
	@JsonIgnore
	@Getter(onMethod_ = {@JsonIgnore})
	private DescriptionTranslations descriptionTranslations;
	private List<EquipmentProperty> extended;
	/**
	 * * HierarchyScopeType in B2MML
	 */
	private String parentID;

	// ISSUE #10: add EquipmentCapabilityTestSpecifications

	public AbstractEquipment() {
		super();
	}

}