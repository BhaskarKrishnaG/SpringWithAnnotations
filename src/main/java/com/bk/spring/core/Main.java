package com.bk.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bk.spring.core.config.AppConfiguration;

public class Main {

	public static void main(String[] args) {

		Employee bk = new Employee("Bhaskar", "Krishna");
//		System.out.println(bk);
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

		EmployeeCRUD crud = appContext.getBean(EmployeeCRUD.class);
		crud.createEmployee(bk);
	}

}
