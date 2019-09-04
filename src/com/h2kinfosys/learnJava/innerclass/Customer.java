package com.h2kinfosys.learnJava.innerclass;

public class Customer {

	
	public static void main(String[] args) {
		// Anonymous inner class
		Reachable reach = new Reachable() {
			
			private String weirdRight = "Check Variable";
			
			@Override
			public boolean validateAddress(String address) {
				System.out.println("Address is valid :: " + address);
				return true;
			}
			
			public void testAnotherMethod() {
				System.out.println("test another method");
			}
		};
		
		Customer cust = new Customer();
		boolean check = reach.validateAddress("Some Address");
		if(check)System.out.println("Returns true");
	}
}
