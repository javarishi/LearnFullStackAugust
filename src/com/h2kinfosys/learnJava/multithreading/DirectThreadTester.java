package com.h2kinfosys.learnJava.multithreading;

public class DirectThreadTester {

	public static void main(String[] args) {
		DirectThread direct = new DirectThread();
		
		Thread threadOne = new Thread(direct);
		Thread threadTwo = new Thread(direct);
		
		direct.start();
	

	}

}
