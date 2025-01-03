package com.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.transaction.Transactional;


@SpringBootApplication
public class SpringBootStoredProcedureCallApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService empService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStoredProcedureCallApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Employee> list = empService.getAllEmployees();
		for (Employee employee : list) {
			System.out.println(employee.getFullName() + ":" + employee.getEmail() + ":" + employee.getAddress()); 
		}
		
	}

}
