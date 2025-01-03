package com.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	@Transactional
	public List<Employee> getAllEmployees() {
		return repo.getAllEmployees();
	
	}

}
