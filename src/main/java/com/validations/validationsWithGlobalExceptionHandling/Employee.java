package com.validations.validationsWithGlobalExceptionHandling;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "name cannot be null")
	private String name;
	
	@Min(value=20,message = "age should be above 20")
	@Max(value=80,message = "age should be below 80")
	private int age;
	
	@Email
	@NotBlank(message = "email cannot be null")
	@UniqueEmail(message= "email must be unique")
	private String email;
	
	private Date creationDate;
	

}
