package com.openfab.isa95.equipments;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EquipmentClassController {

	@Autowired
	private EquipmentClassRepository repo;

	@GetMapping("/equipment-class")
	@ResponseBody
	public AbstractEquipmentTreeNode getEquipmentClassTree() {
		List<EquipmentClass> classes = new ArrayList<EquipmentClass>();
		repo.findSimpleAll().forEach(el -> classes.add(el));
		AbstractEquipmentTreeProvider provider = AbstractEquipmentTreeProvider
				.getInstance(classes);
		return provider.asTree();
	}

	@GetMapping("/equipment-class/{id}")
	@ResponseBody
	public ResponseEntity<EquipmentClass> getEquipmentClass(
			@PathVariable String id) {
		return reponseWithHTTPStatus(repo.findById(id));
	}

	private <T> ResponseEntity<T> reponseWithHTTPStatus(Optional<T> entity) {
		if (entity.isPresent())
			return new ResponseEntity<T>(entity.get(), HttpStatus.OK);
		return new ResponseEntity<T>(HttpStatus.NOT_FOUND);
	}

}
