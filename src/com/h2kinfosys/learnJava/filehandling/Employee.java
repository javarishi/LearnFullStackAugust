package com.h2kinfosys.learnJava.filehandling;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private String firstName;
	private String lastName;
	private int empId;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	

}
