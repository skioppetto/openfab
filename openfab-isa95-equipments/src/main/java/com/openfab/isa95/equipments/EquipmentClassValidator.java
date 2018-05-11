package com.openfab.isa95.equipments;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class EquipmentClassValidator implements Validator {

	private EquipmentClassRepository repo;

	@Autowired
	public EquipmentClassValidator(EquipmentClassRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return EquipmentClass.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		EquipmentClass ec = (EquipmentClass) target;
		// check if level root, parentID should be empty
		if (ec.getLevel().isRoot() && null != ec.getParentID())
			errors.rejectValue("parentID", "parentID.not_null");

		// check if level not root,
		if (!ec.getLevel().isRoot()) {
			// - parentID should be not null and not blank
			if (ec.getParentID() == null)
				errors.rejectValue("parentID", "parentID.null");
			else if (ec.getParentID() != null
					&& ec.getParentID().trim().isEmpty())
				errors.rejectValue("parentID", "parentID.blank");
			else {
				Optional<EquipmentClass> parent = repo.findById(ec
						.getParentID());
				if (!parent.isPresent()) {
					// - parentID should exists equipmentClass
					errors.rejectValue("parentID", "parentID.not_found");
				} else if (!parent.get().getLevel().getParents()
						.contains(ec.getLevel())) {
					// - parentID should be in possibile level parents
					errors.rejectValue("parentID", "parentID.wrong");
				}
			}
		}
	}
}
