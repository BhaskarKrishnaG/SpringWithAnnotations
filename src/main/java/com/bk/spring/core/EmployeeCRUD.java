package com.bk.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeCRUD {
	
	@Autowired
	EmployeeService service;

	Employee createEmployee(Employee emp) {
		System.out.println("Employee " + emp.fname + " " + emp.lname + " added to the system!");

		return service.generateMail(emp);
	}
}