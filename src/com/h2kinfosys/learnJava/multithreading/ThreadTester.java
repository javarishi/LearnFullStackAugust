package com.h2kinfosys.learnJava.multithreading;

public class ThreadTester {

	public static void main(String[] args) {
		ThreadTask task = new ThreadTask();
		// Create thread with Thread Class
		System.out.println("Threads are getting created");
		// Init state of thread
		Thread firstThread = new Thread(task);
		Thread secondThread = new Thread(task);
		Thread thirdThread = new Thread(task);
		// Start the thread - running state
		// Methods on thread class. 
		firstThread.setName("firstThread");
		secondThread.setName("secondThread");
		thirdThread.setName("thirdThread");
		thirdThread.setDaemon(true);
		firstThread.start();
		secondThread.start();
		thirdThread.start();
		
		// Priority range 1 - 10
		firstThread.setPriority(Thread.NORM_PRIORITY);
		secondThread.setPriority(Thread.MAX_PRIORITY);
		thirdThread.setPriority(Thread.MIN_PRIORITY);
		
		try {
			firstThread.join();
			secondThread.join();
			thirdThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Threads are Done with the task");
	}

}
