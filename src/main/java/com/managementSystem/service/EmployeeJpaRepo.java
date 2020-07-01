package com.managementSystem.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.managementSystem.model.Employee;

public interface EmployeeJpaRepo extends CrudRepository<Employee, Integer> {
	@Query("Select e from Employee e where e.firstName like :name or e.lastName like :name")
    public List<Employee> findByName(@Param(value = "name") String name);
}
