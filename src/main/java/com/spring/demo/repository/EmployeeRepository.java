package com.spring.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
