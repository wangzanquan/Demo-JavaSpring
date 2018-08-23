package com.spring.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.model.Employee;
import com.spring.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	
	//Get all info
	public List<Employee> findAll(){
		List<Employee> employees = new ArrayList<>();
		repo.findAll().forEach(employees::add);
		return employees;
	}
	
	//Find one
	public Optional<Employee> findOne(int id){
		return repo.findById(id);
	}
	
	//Add new employee info
	public Employee addEmployee(Employee emp) {
		repo.save(emp);
		return emp;
	}
	
	//Update one
	//!!!!!!!!!generate new id????
	public Employee updateOne(Employee emp, int id) {
		return repo.save(emp);
	}
	
	//Delete one
	public int deletOne(int id) {
		repo.deleteById(id);
		return id;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
