package com.nandini.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nandini.demo.Employee;
import com.nandini.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee")
	private List<Employee>getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	@GetMapping("/employee/{id}")
	
		private Employee getEmployee(@PathVariable("id") int id) {
		return employeeService.getEmployeeById(id);
	}
	@DeleteMapping("/employee/{employeeid}")
	private void deleteEmployee(@PathVariable("id")int id)
	{
		employeeService.delete(id);
	}
	@PostMapping("/employee")
	private int saveEmployee(@RequestBody Employee employee)
	{
		employeeService.saveOrUpdate(employee);
		return employee.getId();
	}
    @PutMapping("/employee")
    
    	private Employee update(@RequestBody Employee employee)
    	{
    	employeeService.saveOrUpdate(employee);
    	return employee;
    	}
    
}
