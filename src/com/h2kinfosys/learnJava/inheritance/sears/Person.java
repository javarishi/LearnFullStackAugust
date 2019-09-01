package com.h2kinfosys.learnJava.inheritance.sears;

// Cannot instantiate Abstract class
public abstract class Person implements Reachable {
	
	protected String companyName = "Sears Inc";
	
	// Abstract method do not have body
	// You cannot create abstract method in non-abstract class
	// abstract method MUST be implemented by first implementor child / Non-abstract child
	public abstract void checkCreditReport(String ssnNumber);
	
	public void methodChecking() {
		System.out.println("Abstract class can have Non Abstract Method");
	}

}
