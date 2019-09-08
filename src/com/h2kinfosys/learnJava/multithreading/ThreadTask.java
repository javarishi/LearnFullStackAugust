package com.h2kinfosys.learnJava.multithreading;

import java.util.Calendar;

public class ThreadTask implements Runnable{
	
	private int count = 1;
	
	public ThreadTask() {
		System.out.println("Thread Task Constructor");
	}

	@Override
	public void run() {
		int total = 0;
		for(int i=0; i < 10; i++) {
			System.out.println("Value of i :: " + i + " For thread :: " + Thread.currentThread().getName());
			total = total + i;
		}
		importantAccess();
		// Sleep - wait for few seconds 
		try {
			System.out.println(Thread.currentThread().getName() + "  " +  Calendar.getInstance().getTime());
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + "  " +  Calendar.getInstance().getTime());
		} catch (InterruptedException e) {
			System.out.println("Who is intrupting me : " + e.getMessage());
			e.printStackTrace();
		}
		//Thread.yield();
		System.out.println("Total Caluclated for Thread " + Thread.currentThread().getName() +  " Total is :: " + total);
		System.out.println("Some Task :: " + count++);
	}
	
	
	
	public void importantAccess() {
		
		System.out.println("This statement will still have multi thread access");
		synchronized(this) {
			System.out.println("Printing file system variables " + Thread.currentThread().getName());
		}
		
	}

}
