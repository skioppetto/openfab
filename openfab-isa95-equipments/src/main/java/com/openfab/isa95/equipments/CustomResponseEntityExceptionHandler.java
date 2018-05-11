package com.openfab.isa95.equipments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		List<CustomValidationError> errors = new ArrayList<CustomValidationError>();
		BindingResult bindResult = ex.getBindingResult();
		for (FieldError fe : bindResult.getFieldErrors()){
			List<CustomValidationErrorProperty> propErrors = new ArrayList<CustomValidationErrorProperty>();
			for (String code : fe.getCodes())
				propErrors.add(new CustomValidationErrorProperty(code, fe.getDefaultMessage()/*TODO: manage descriptions*/));
			errors.add(new CustomValidationError(fe.getField(), propErrors));
		}
		return ResponseEntity.badRequest().body(errors);
	}

	
	
	
}
