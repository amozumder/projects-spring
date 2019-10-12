package com.hulu.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hulu.myapp.model.Employee;
import com.hulu.myapp.service.EmployeeService;

@Controller
public class MyAppController {
	
	@Autowired
	private EmployeeService empservice;
	
	@RequestMapping("/")
	public String getEmployeeList(Model model ) {
		List<Employee> empList = empservice.listAll();
		model.addAttribute("empList",empList);
		return "index";
	}
	

}
