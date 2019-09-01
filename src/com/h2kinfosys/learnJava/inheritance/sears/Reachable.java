package com.h2kinfosys.learnJava.inheritance.sears;

public interface Reachable {
	
	// variables in Interface are always (implicitly) public, static and final
	String companyName = "Sears Inc";
	// final = you cannot change the value
	
	
	// implicitly interface methods - are always public and abstract
	public abstract boolean validateAddress(String address);
	
	// Interface methods (as abstract ) cannot have body - unless declared default
	/*
	public  void tryNonAbstract() {
		System.out.println("Trying non abstract method");
	}*/

}
