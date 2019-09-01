package com.h2kinfosys.learnJava.inheritance.sears;

public class Tester {

	// you cannot change the value of final variables 
	private final String tryToChange = "Change Me Please";
	
	// final methods cannot be overridden 
	// final classes cannot be sub classed
	
	public static void main(String[] args) {
		
		/*Customer cust = new Customer();
		boolean check = cust.validateAddress("3375 Spring Hill Pwky");
		if(check) {
			System.out.println("Valid Address");
		}*/

		PreferredCustomer pCust = new PreferredCustomer("a@b.com");
		boolean check = pCust.validateAddress("3375 Spring Hill Pwky");
		if(check) {
			System.out.println("Valid PreferredCustomer Address");
		}
		pCust.methodChecking();
		
		CreditCardCustomer creditCard = new CreditCardCustomer("a@b.com", "123456789012345");
		check = creditCard.validateAddress("3375 Spring Hill Pwky");
		if(check) {
			System.out.println("Valid CreditCardCustomer Address");
		}
		creditCard.methodChecking();
		
		
		Tester test = new Tester();
		//test.tryToChange = "Another value";
		
		
	}

}
