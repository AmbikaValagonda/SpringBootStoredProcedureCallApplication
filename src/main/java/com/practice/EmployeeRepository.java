package com.practice;

import java.util.List;


import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;




public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	@Procedure(name = "getAllEmployees")
	List<Employee> getAllEmployees();

}
