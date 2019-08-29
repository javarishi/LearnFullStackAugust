package com.h2kinfosys.learnJava.basics2;

import java.util.Calendar;

import com.h2kinfosys.learnJava.basics.Variables;

public class BestBuyBatchTrigger {

	// ctrl + shift + t ==> type class name
	// ctrl + shift + o ==> removes unwanted imports
	// ctrl+ space => Import the class
	public static void main(String[] args) {
		// Day of the week - start price batch
		/*
		 * Monday - 7:30    - 2 
		 * Tuesday - 8:30   - 3
		 * Wed - 8:30 - 4
		 * Thurs - 9:00
		 * Fri - 7:00
		 * Sat - 7:30
		 * Sun - 8:00 am
		 */

		System.out.println(Calendar.getInstance().getTime());
		int day_of_week =  Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
		System.out.println("Day of the week :: " + day_of_week);
		
		switch(day_of_week){
			case 1:
			case 2:
			case 7: {
						System.out.println("Batch Triggers at 7:30 AM");
						break;
					}
		
			case 3: 
			case 4: {
						System.out.println("Batch Triggers at 8:30 AM");
						break;
					}
			
			case 5: {
						System.out.println("Batch Triggers at 9:00 AM");
						break;
					}
			case 6: {
						System.out.println("Batch Triggers at 7:00 AM");
						break;
					}
			
			default: {
						System.out.println("Batch Triggers at 8:00 AM");
						break;
					}
		
		}
		
		System.out.println("Jumped out of Switch block");
		
		
	}

}
