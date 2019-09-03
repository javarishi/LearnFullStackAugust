package com.h2kinfosys.learnJava.exception;



import java.util.Calendar;

import com.h2kinfosys.learnJava.inheritance.sears.Customer;
/*
 * AirthmaticException - all mathematical
 * IndexOutOfBound - Index is not in collection
 * ArrayIndexOutOfBound - index not in array
 * NullPointer - object ref is null
 * IntruptedException - Thread which you are working is distrubred 
 * IOException - Input Output Exception
 * SQLException - DB
 * ServletException - Web - we will see it later
 * NumberFormatException - conversions
 */
public class TestException {

	public static void main(String[] args) {
		// Exception - faulty scenario
		int varOne = 10;
		int varTwo = 1;
		int[] array = {1,2,3,4};
		System.out.println("Varone " + varOne);
		float division = 0.0f;
		Customer cust = null;
		try {
			division = varOne / varTwo;
			System.out.println(array[1]);
		//	cust.tryNonAbstract();
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
			// Exception handling block
		}catch(ArrayIndexOutOfBoundsException aex) {
			aex.printStackTrace();
		}catch(Exception ex) {
			// Always handle specific exception first - then handle generic
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("Executed regardless there is an exception or not");
		}
		// Execution continues
		System.out.println("varTwo " + varTwo);
		System.out.println("Divison :: " + division);
		// try risky code and catch exception
		
		
		// Hang the code for 5 seconds
		try {
			System.out.println(Calendar.getInstance().getTime());
			Thread.sleep(500);
			System.out.println(Calendar.getInstance().getTime());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String value = "100A";
		int inValue = Integer.parseInt(value);
		System.out.println(inValue);
		
		WalgreensStore walgreens = new WalgreensStore();
		try {
			walgreens.ageValidation(20);
		} catch (AgeValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
