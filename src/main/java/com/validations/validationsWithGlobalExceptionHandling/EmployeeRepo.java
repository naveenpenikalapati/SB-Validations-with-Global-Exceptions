package com.validations.validationsWithGlobalExceptionHandling;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

	List<Employee> findByEmail(String email);

}
