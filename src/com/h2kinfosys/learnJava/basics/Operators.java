package com.h2kinfosys.learnJava.basics;

public class Operators {
	/*
	 * 1. Mathmatical Operators
	 * 2. Camparison
	 * 3. Condition - if - else 
	 * 4. Logical expressions
	 * 5. Switch - case
	 * 6. Introduce - Calender class
	 * 7. Eclipse shortcuts 
	 *
	 */
	public static void main(String[] args) {
		// Mathematical Operators  + , -, / , *, %
		
		System.out.println("Addition :: " + (100+200));
		// Complete all operators
		
		// Comparators < > <= >= != == instanceof --> Result is boolean
		System.out.println("Less than :: " + (100 > 200));
		// Complete other operators
		
		// .equals <-- method provided to compare objects
		String sample_One = "Sample String";
		String sample_two = "Sample String";
		
		boolean test = sample_One.equals(sample_two);
		System.out.println(test);
		
		int numberOne = 400;
		int numberTwo = 300;
		int numberThree = 500;
		
		test = numberOne > numberTwo;
		
		// Conditions - if 
		/*
		 * if condition (boolean result) = true {
		 * 		block of code which executes when result is true
		 * }
		 * else{
		 * 		block of code which executes when result is false
		 * }
		 */
		if(numberOne > numberTwo) {
			System.out.println("Bigger Number is :: " + numberOne);
		}else if(numberTwo > numberThree){
				System.out.println("Bigger Number is :: " + numberTwo);
			}else {
				System.out.println("Bigger Number is :: " + numberThree);
			}
		
	
	// Logical Expressions - AND - OR - NOT
	/*
	 * AND - &&
	 * S1	S2	R
	 * T	T	T
	 * T	F	F
	 * F	T	F	
	 * F	F	F
	 * 
	 * 	 * OR - ||
	 * S1	S2	R
	 * T	T	T
	 * T	F	T
	 * F	T	T	
	 * F	F	F
	 * 
	 */

	if ((numberOne > numberTwo) && (numberOne > numberThree)) {
		System.out.println("Bigger number is :: " + numberOne);
	}else if(numberTwo > numberThree) {
		System.out.println("Bigger Number is :: " + numberTwo);
	}else {
		System.out.println("Bigger Number is :: " + numberThree);
	}
		
	boolean testNot = false;
	if(!testNot) {
		System.out.println("TestNot is  " + testNot);
	}
	}
}
