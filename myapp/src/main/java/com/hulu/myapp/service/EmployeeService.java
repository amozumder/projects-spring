package com.hulu.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hulu.myapp.model.Employee;
import com.hulu.myapp.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;
	
	//Return list of employees
	public List<Employee> listAll() {
		return employeeRepo.findAll();
	}
	
	//Return a specific employee
	public Employee listById(Long id) {
		return employeeRepo.findById(id).get();
	}
	
	//Save an employee
	public void saveEmployee(Employee emp) {
		employeeRepo.save(emp);
	}
	
	//Delete an employee
	public void deleteById(Long id) {
		employeeRepo.deleteById(id);;
	}
	
}
