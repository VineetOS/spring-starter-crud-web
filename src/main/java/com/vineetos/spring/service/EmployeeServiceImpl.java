package com.vineetos.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vineetos.spring.model.Employee;
import com.vineetos.spring.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	

}
