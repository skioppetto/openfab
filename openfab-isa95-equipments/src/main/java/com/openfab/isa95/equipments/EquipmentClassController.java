package com.openfab.isa95.equipments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EquipmentClassController {

	@Autowired
	private EquipmentClassRepository repo;

	@GetMapping("/equipment-class")
	@ResponseBody
	public AbstractEquipmentTreeNode getEquipmentClassTree() {
		AbstractEquipmentTreeProvider provider = AbstractEquipmentTreeProvider
				.getInstance(repo.findAll());
		return provider.asTree();
	}

}
