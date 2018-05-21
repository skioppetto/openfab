package com.openfab.isa95.equipments;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import static com.openfab.isa95.equipments.DescriptionLocalizedUtil.setLanguage;

@Controller
public class EquipmentClassController {

	@Autowired
	private EquipmentClassRepository repo;

	@Autowired
	private EquipmentClassValidator equipmentClassValidator;

	@GetMapping("/equipment-class")
	@ResponseBody
	public AbstractEquipmentTreeNode getEquipmentClassTree(
			@RequestParam(required = false) String lang) {
		List<EquipmentClass> classes = new ArrayList<EquipmentClass>();
		repo.findSimpleAll().forEach(el -> classes.add(setLanguage(el, lang)));
		AbstractEquipmentTreeProvider provider = AbstractEquipmentTreeProvider
				.getInstance(classes);
		return provider.asTree();
	}

	@GetMapping("/equipment-class/{id}")
	@ResponseBody
	public ResponseEntity<EquipmentClass> getEquipmentClass(
			@PathVariable String id, @RequestParam(required = false) String lang) {
		return reponseWithHTTPStatus(repo.findByName(id), lang);
	}

	@GetMapping("/equipment-class/{id}/translations")
	@ResponseBody
	public ResponseEntity<DescriptionTranslations> getEquipmentClassTranslations(
			@PathVariable String id) {
		Optional<EquipmentClass> ec = repo.findByName(id);
		if (ec.isPresent())
			return reponseWithHTTPStatus(
					Optional.of(ec.get().getDescriptionTranslations()), null);
		return ResponseEntity.notFound().build();
	}

	@GetMapping("/equipment-class/{id}/extended/{key}/translations")
	@ResponseBody
	public ResponseEntity<DescriptionTranslations> getEquipmentClassPropertyTranslations(
			@PathVariable String id, @PathVariable String key) {
		Optional<EquipmentClass> ec = repo.findByName(id);
		Optional<EquipmentProperty> equipmentProperty = ec.get().getExtended()
				.stream().filter(e -> key.equals(e.getKey())).findFirst();
		if (!equipmentProperty.isPresent())
			return ResponseEntity.notFound().build();
		return reponseWithHTTPStatus(Optional.of(equipmentProperty.get()
				.getDescriptionTranslations()), null);
	}

	@GetMapping("/equipment-class/{id}/extended")
	public ResponseEntity<List<EquipmentProperty>> getEquipmentClassProperties(
			@PathVariable String id) {
		Optional<EquipmentClass> ec = repo.findByName(id);
		if (ec.isPresent())
			return reponseWithHTTPStatus(Optional.of(ec.get().getExtended()),
					null);
		return ResponseEntity.notFound().build();
	}

	@PostMapping("/equipment-class")
	public ResponseEntity<EquipmentClass> createEquipmentClass(
			@Valid @RequestBody EquipmentClass clz, @RequestParam(required = false) String lang) {
		EquipmentClass ec = repo.save(clz);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(ec.getName()).toUri();
		return ResponseEntity.created(location).build();
	}

	@PostMapping("/equipment-class/{id}/translations")
	public ResponseEntity<DescriptionTranslations> createEquipmentClassTranslations(
			@PathVariable String id,
			@RequestBody DescriptionTranslations translations) {
		Optional<EquipmentClass> ec = repo.findByName(id);
		if (!ec.isPresent())
			return ResponseEntity.notFound().build();
		ec.get().setDescriptionTranslations(translations);
		repo.save(ec.get());
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().build()
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@PostMapping("/equipment-class/{id}/extended")
	public ResponseEntity<List<EquipmentProperty>> createEquipmentClassProperties(
			@PathVariable String id,
			@RequestBody List<EquipmentProperty> properties) {
		Optional<EquipmentClass> ec = repo.findByName(id);
		if (!ec.isPresent())
			return ResponseEntity.notFound().build();
		ec.get().setExtended(properties);
		repo.save(ec.get());
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().build()
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@PostMapping("/equipment-class/{id}/extended/{key}/translations")
	public ResponseEntity<DescriptionTranslations> createEquipmentClassPropertyTranslations(
			@PathVariable String id, @PathVariable String key,
			@RequestBody DescriptionTranslations translations) {
		Optional<EquipmentClass> ec = repo.findByName(id);
		Optional<EquipmentProperty> equipmentProperty = ec.get().getExtended()
				.stream().filter(e -> key.equals(e.getKey())).findFirst();
		if (!equipmentProperty.isPresent())
			return ResponseEntity.notFound().build();
		equipmentProperty.get().setDescriptionTranslations(translations);
		repo.save(ec.get());
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().build()
				.toUri();
		return ResponseEntity.created(location).build();
	}

	private <T> ResponseEntity<T> reponseWithHTTPStatus(Optional<T> entity,
			String lang) {
		if (entity.isPresent())
			return new ResponseEntity<T>(setLanguage(entity.get(), lang),
					HttpStatus.OK);
		return new ResponseEntity<T>(HttpStatus.NOT_FOUND);
	}

	@InitBinder
	public void setupValidatorBinder(WebDataBinder binder) {
		binder.addValidators(equipmentClassValidator);
	}

}
