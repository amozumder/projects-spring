package com.hulu.myapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {
	// State variables
	private Long id;
	private String name;
	private String dob;
	private String department;
	private String passwd;

	// Default constructor
	public Employee() {	}

	//Getter methods
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}

	public String getDepartment() {
		return department;
	}

	public String getPasswd() {
		return passwd;
	}

	//Setter methods
	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	

}
