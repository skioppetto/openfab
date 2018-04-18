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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.openfab.isa95.equipments.DescriptionLocalizedUtil.setLanguage;

@Controller
public class EquipmentClassController {

	@Autowired
	private EquipmentClassRepository repo;

	@GetMapping("/equipment-class")
	@ResponseBody
	public AbstractEquipmentTreeNode getEquipmentClassTree(@RequestParam(required=false) String lang) {
		List<EquipmentClass> classes = new ArrayList<EquipmentClass>();
		repo.findSimpleAll().forEach(el -> classes.add(setLanguage(el, lang)));
		AbstractEquipmentTreeProvider provider = AbstractEquipmentTreeProvider
				.getInstance(classes);
		return provider.asTree();
	}

	@GetMapping("/equipment-class/{id}")
	@ResponseBody
	public ResponseEntity<EquipmentClass> getEquipmentClass(
			@PathVariable String id,
			@RequestParam(required=false) String lang) {
		return reponseWithHTTPStatus(repo.findById(id), lang);
	}

	private <T> ResponseEntity<T> reponseWithHTTPStatus(Optional<T> entity, String lang) {
		if (entity.isPresent())
			return new ResponseEntity<T>(setLanguage(entity.get(), lang), HttpStatus.OK);
		return new ResponseEntity<T>(HttpStatus.NOT_FOUND);
	}

}
