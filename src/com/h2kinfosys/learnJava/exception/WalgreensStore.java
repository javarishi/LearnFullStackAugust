package com.h2kinfosys.learnJava.exception;

public class WalgreensStore {

	// Creating checked exception - asking users to handle error
	public boolean ageValidation(int age) throws AgeValidationException {
		boolean flag;
		if(age >= 21) {
			System.out.println("Customer can purchase alcohol");
			flag = true;
		}else {
			throw new AgeValidationException("Age is not sufficient");
		}
		
		return flag;
	}
}
