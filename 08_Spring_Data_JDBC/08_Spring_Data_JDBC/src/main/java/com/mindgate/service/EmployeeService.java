package com.mindgate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.pojo.Employee;
import com.mindgate.repository.EmployeeRespositoryInterface;

@Service
public class EmployeeService implements EmployeeServiceInterface {
	@Autowired
	private EmployeeRespositoryInterface employeeRespositoryInterface;

	@Override
	public boolean addNewEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		
		return employeeRespositoryInterface.addNewEmployee(employee);
		
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		
		
		// TODO Auto-generated method stub
		return employeeRespositoryInterface.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return employeeRespositoryInterface.deleteEmployee(employeeId);
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return employeeRespositoryInterface.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		
		// TODO Auto-generated method stub
		return employeeRespositoryInterface.getAllEmployees();
	}

}
