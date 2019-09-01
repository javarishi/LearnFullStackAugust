package com.h2kinfosys.learnJava.inheritance.sears;

public abstract class Customer extends Person{
	
	public Customer() {
		System.out.println("Customer Constructor");
	}
	// Encapsulation - variables are private
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	
	// public method - validate address
	@Override
	public  boolean validateAddress(String address) {
		boolean result = false;
		if(address != null && address.trim().length() > 0) {
			result = true;
		}
		return result;
	}


}
