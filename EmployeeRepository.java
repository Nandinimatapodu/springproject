package com.nandini.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.nandini.demo.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}
