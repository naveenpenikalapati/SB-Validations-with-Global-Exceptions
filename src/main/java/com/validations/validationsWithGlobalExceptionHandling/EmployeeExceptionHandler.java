package com.validations.validationsWithGlobalExceptionHandling;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeExceptionHandler {

	@ResponseStatus(HttpStatus.BAD_GATEWAY)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Object> handleMethodArguementexception(MethodArgumentNotValidException ex)
	{
		Map<String,String> errors = new HashMap<>();
		                  ex.getBindingResult().getAllErrors().forEach(error -> {
		                	  String fieldName = ((FieldError) error).getField();
		                      String errorMessage = error.getDefaultMessage();
		                      errors.put(fieldName, errorMessage);
		                  });
		   return new ResponseEntity<>(errors, HttpStatus.BAD_GATEWAY);
	}
}
