package com.validations.validationsWithGlobalExceptionHandling;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo EmployeeRepo ;
	
	public Employee addEmployee(EmployeeDTO empDTO) 
	{   
		// convert EmployeeDTO into Employee entity using mapstruct
		
   Employee employee = MapperConversion.instance.populateEmployee(empDTO);
//		 Employee employee = new Employee();
//
//	        employee.setName( empDTO.getName() );
//	        employee.setAge( empDTO.getAge() );
//	        employee.setEmail( empDTO.getEmail() );

	       employee.setCreationDate(new Date());
		   return EmployeeRepo.save(employee);
				  
	}

	public List<Employee> getEmployee() {
		
		return EmployeeRepo.findAll();
	}

}
