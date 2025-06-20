package com.validations.validationsWithGlobalExceptionHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

@Component
public class UniqueEmailValidation implements ConstraintValidator<UniqueEmail,String> {

	@Autowired
	 private EmployeeRepo employeeRepo;
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if(employeeRepo.findByEmail(value).size()==0)
			return true;
		
		return false;
	}

}
