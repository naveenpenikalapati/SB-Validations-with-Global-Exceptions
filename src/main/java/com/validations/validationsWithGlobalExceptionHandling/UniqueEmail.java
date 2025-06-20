package com.validations.validationsWithGlobalExceptionHandling;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueEmailValidation.class)
public @interface UniqueEmail {
	
	// code for creating custom validator
   public String message() default "email address must be UNIQUE";

   public  Class<?>[] groups() default {};

   public Class<? extends Payload>[] payload() default {};

}
