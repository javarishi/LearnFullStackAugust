package com.h2kinfosys.learnJava.basics;

/*
 * Multi-line comment
 * Where I can write any number of lines 
 * Java doesnt care about this
 */

// Single line comment - it can appear anywhere 
public class HelloWorld {
	
	/**
	 * 1. Download and Install Eclipse
	 * 2. Configured JDK
	 * 3. Create a Project 
	 * 4. Create a Package
	 * 5. Create a class 
	 * 6. Remember ctrl + space
	 * 7. Difference and importance of JRE, JVM, JDK
	 * 8. Java is operating System independent (because of JVM)
	 */
	// Object - properties - variable & function - methods
	
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		System.out.println("Remember control + space in Eclipse");
		
		// instance = object 
		HelloWorld englishHello = new HelloWorld(); // englishHello instance of class HelloWorld
		HelloWorld spanishHello = new HelloWorld();
		HelloWorld frenchHello = new HelloWorld();
	}

}
