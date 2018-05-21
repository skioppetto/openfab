package com.openfab.isa95.equipments;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
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
public class CustomResponseEntityExceptionHandler extends
		ResponseEntityExceptionHandler {

	@Autowired
	private ResourceBundleMessageSource i18nMessages;

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		List<CustomValidationError> errors = new ArrayList<CustomValidationError>();
		BindingResult bindResult = ex.getBindingResult();
		String[] languages = request.getParameterMap().get("lang");
		
		Locale locale = (null != languages && languages.length > 0) ? Locale
				.forLanguageTag(languages[0]) : Locale.getDefault();
		for (FieldError fe : bindResult.getFieldErrors()) {
			List<CustomValidationErrorProperty> propErrors = new ArrayList<CustomValidationErrorProperty>();
			for (String code : fe.getCodes())
				propErrors.add(new CustomValidationErrorProperty(code, 
						i18nMessages.getMessage(code, new Object[]{}, locale)));
			errors.add(new CustomValidationError(fe.getField(), propErrors));
		}
		return ResponseEntity.badRequest().body(errors);
	}

}
