package com.validations.validationsWithGlobalExceptionHandling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService EmployeeService;
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee( @RequestBody @Valid EmployeeDTO empDTO)
	{
		return new ResponseEntity<>(EmployeeService.addEmployee(empDTO),HttpStatus.ACCEPTED);
	}
}
