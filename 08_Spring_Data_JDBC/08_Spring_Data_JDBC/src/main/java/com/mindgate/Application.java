package com.mindgate;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);

//		boolean result = employeeService.deleteEmployee(4);
//		if (result) {
//			System.out.println("updated sucessfully");
//		} else {
//			System.out.println("failed");
//		}
//
////		update
//		Employee employee = new Employee(99, "up NEW", 800);
//		boolean result = employeeService.updateEmployee(employee);
//		if (result) {
//			System.out.println("updated sucessfully");
//		}
//		else {
//			System.out.println("failed");
//		}

//		adding emp
//
//		Employee employee = new Employee(99, "NEW", 500);
//		boolean result = employeeService.addNewEmployee(employee);
//		if (result) {
//			System.out.println("Added sucessfully");
//		}
//		else {
//			System.out.println("failed");
//		}
//		
//		

//		getting all emps
//		EmployeeService employeeService =  applicationContext.getBean("employeeService", EmployeeService.class);
//		
//		Employee employee = employeeService.getEmployeeByEmployeeId(25);
//		
//		List<Employee> allEmployees = employeeService.getAllEmployees();
//
//		for (Employee employee1 : allEmployees) {
//			System.out.println(employee1);
//		}
	}

}
