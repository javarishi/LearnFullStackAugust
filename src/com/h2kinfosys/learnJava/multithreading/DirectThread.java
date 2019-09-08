package com.h2kinfosys.learnJava.multithreading;

public class DirectThread extends Thread {
	
	
	@Override
	public synchronized void start() {
		super.start();
		System.out.println("My Own Logic to start a thread");
	}

	
	@Override
	public void run() {
		int total = 0;
		for(int i=0; i < 10; i++) {
			System.out.println("Value of i :: " + i + " For thread :: " + Thread.currentThread().getName());
			total = total + i;
		}
		System.out.println("Total " + total);
	}
}
