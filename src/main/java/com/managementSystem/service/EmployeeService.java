package com.managementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.managementSystem.model.Employee;
@Service
public class EmployeeService {
	
	
	@Autowired
	EmployeeJpaRepo repo;
	public List<Employee> getEmployees() {
		return (List<Employee>) repo.findAll();
	}

	public void addEmployee(Employee employee) {
		repo.save(employee);
	}

	public void deleteEmployee(int id) {
		repo.deleteById(id);
	}
	
	public Employee getEmployee(int id) {
		return repo.findById(id).get();
	}
	
	public List<Employee> search(String name){
		return repo.findByName(name);
	}
}
