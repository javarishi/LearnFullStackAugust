package com.h2kinfosys.learnJava.basics;

public class Variables {
	
	/*
	 * 1. Variables
	 * 2. Object and Class - creating an object of class
	 * 3. Primitives
	 * 4. Strings  -start
	 * 5. instance and class variables , local (method)
	 * 6. Access Modifiers (import)
	 */
	
	// Properties - Variables are instance variable
	// Primitives - data type
	// Numeric Data
	byte byteData = 99;
	short shortData = 9999;
	int intData = 999999999;
	long longData = 9999999999l;

	// decimal point
	float floatData = 1212.21323f;
	double doubleData = 23213.21321;
	
	// character 
	char charData = 'A'; // Single quote, only one chara
	
	// Boolean 
	boolean boolData = false;
	
	// String - Non Primitive
	String strData = "Anything.. from single alphabet to a novel";
	
	
	// Class Level variable (static) - reference variables 
	// common values for all instances
	static String companyName = "H2KInfosys Inc";
	
	public static void main(String[] args) {
		
		String localVar = "Something in Local Variable";
		
		Variables varOne = new Variables();
		Variables.companyName = "Best Buy Inc";
		// Properties and Methods are accessible with . --> instanceName.<variables> or funtions
		varOne.strData = "I am giving a new value ";
		System.out.println("VarOne :: " +  varOne.strData);
		
		//System.out.println("VarOne :: " +  Variables.companyName);
		
		Variables varTwo = new Variables();
		System.out.println("varTwo :: " + varTwo.strData);
		//System.out.println("varTwo :: " +  varTwo.companyName);
	}

}
