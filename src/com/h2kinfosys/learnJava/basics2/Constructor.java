package com.h2kinfosys.learnJava.basics2;

public class Constructor {
	
	// 1. Dont have return type
	// 2. always have class names
	// parameterized constructor - const with arguments
	public Constructor(String sampleParameter) {
		System.out.println("Creating instance of Constructor Class " + sampleParameter);
	}

	public Constructor() {
		this("Something here");
		System.out.println("No Argument Constructor");
	}
	
	public static void main(String[] args) {
		Constructor constructor = new Constructor();
		// Compiler will give you default constructor only when u dont have any contructor at all
	}
}
