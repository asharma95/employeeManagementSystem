package com.managementSystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.managementSystem.model.Employee;
import com.managementSystem.service.EmployeeService;

@Controller
public class HomeController {
	@Autowired
	EmployeeService service;
	
	@RequestMapping("/")
	public String showForm(Model model) {
		List<Employee> employees = new ArrayList<>();
		employees = service.getEmployees();
		model.addAttribute("employees", employees);
		String s= "";
		model.addAttribute("input", s);
		return "main-menu";
	}
}
