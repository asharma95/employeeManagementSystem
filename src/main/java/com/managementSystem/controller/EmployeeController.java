package com.managementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.managementSystem.model.Employee;
import com.managementSystem.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@RequestMapping("/showForm")
	public String putEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "employeeForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("employee") Employee employee) {
		service.addEmployee(employee);
		return "redirect:/";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable String id) {
		service.deleteEmployee(Integer.parseInt(id));
		return "redirect:/";
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable String id, Model model) {
		model.addAttribute("employee", service.getEmployee((Integer.parseInt(id))));
		return "update-employee";
	}
	
	@RequestMapping("/update/updateEmployee")
	public String updateEmployee(@ModelAttribute("employee") Employee employee) {
		service.addEmployee(employee);
		return "redirect:/";
	}
	
	@RequestMapping("/search{searchName}")
	public String search(@RequestParam String searchName, Model model) {
		List<Employee> employees = service.search(searchName);
		model.addAttribute("employees", employees);
		return "searchEmployees";
	}
}