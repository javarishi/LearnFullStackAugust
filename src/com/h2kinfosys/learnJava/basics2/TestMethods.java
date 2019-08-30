package com.h2kinfosys.learnJava.basics2;

/*
 * 1. Loops 
 * 2. Methods
 * 3. Constructor
 * 4. Overloading of method and constructor
 * 5. this - statement
 */

public class TestMethods {
	
	/* Understanding method
	 * 1. Access Modifier
	 * 2. Return type - output (no return is void)
	 * 3. method name - camelCase (get and set -accessors) - 
	 * 4. Arguments or parameters or inputs provided in ()
	 * 5. Method body {}
	 * 6. Exception - see this later
	 * 
	 * @param args
	 */
	
	public String getCustomerDetails(int custId) {
		String text = "Customer with ID :: " + custId;
		return text;
	}
	
	// Overloading
	// 1 Number of arguments
	// 2. Type of argument
	public String getCustomerDetails(String firstName) {
		String text = "Customer with Name :: " + firstName;
		return text;
	}
	
	public String getCustomerDetails(int custId, String firstName) {
		String text = "Customer with Name :: " + firstName + " and ID :: " + custId;
		return text;
	}
	
	public int sumOfStartToEnd(int startValue, int endValue) {
		int sum = 0;
		while(startValue <= endValue) {
			sum = sum + startValue;
			startValue++;
		}
		System.out.println("Sum :: " + sum);
		return sum;
	}
	
	public static void main(String[] args) {
		TestMethods test = new TestMethods();
		int sum = test.sumOfStartToEnd(1, 10);
		System.out.println(sum);
	}
	
	
	

}
