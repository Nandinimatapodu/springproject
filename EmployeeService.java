package com.nandini.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nandini.demo.Employee;
import com.nandini.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	public List<Employee>getAllEmployee()
	{
		List<Employee>employee=new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee1->employee.add(employee1));
		return employee;
	}
	public Employee getEmployeeById(int id)
	{
		return employeeRepository.findById(id).get();
	}
	public void saveOrUpdate(Employee employee)
	{
		employeeRepository.save(employee);
	}
	public void delete(int id)
	{
		employeeRepository.deleteById(id);
	}
	public void update(Employee employee,int id)
	{
		employeeRepository.save(employee);
	}

}
