package com.spring.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Employee;
import com.spring.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employees")
	public List<Employee> getAll(){
		return service.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public Optional<Employee> getOne(@PathVariable int id){
		return service.findOne(id);
	}
	
	@PostMapping("/employees")
	public Object addOne(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateOne(@RequestBody Employee emp, @PathVariable int id) {
		return service.updateOne(emp, id);
	}
	
	@DeleteMapping("/employees/{id}")
	public int deleteOne(@PathVariable int id) {
		return service.deletOne(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
