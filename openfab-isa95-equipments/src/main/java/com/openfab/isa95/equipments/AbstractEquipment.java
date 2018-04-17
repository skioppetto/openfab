package com.openfab.isa95.equipments;

import java.util.List;

import org.springframework.data.annotation.Transient;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Data
@EqualsAndHashCode(of = { "id" })
public abstract class AbstractEquipment {

	private String id;
	private EquipmentLevelEnum Level;
	@Getter(onMethod_ = { @DescriptionLocalized(translationsField = "descriptionTranslations"), @Transient })
	@Transient
	private String description;
	private DescriptionTranslations descriptionTranslations;
	private List<EquipmentProperty> equipmentProperties;
	/**
	 * * HierarchyScopeType in B2MML
	 */
	private String parentID;

	// ISSUE #10: add EquipmentCapabilityTestSpecifications

	public AbstractEquipment() {
		super();
	}

}