package com.hulu.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hulu.myapp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
