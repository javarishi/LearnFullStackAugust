package com.h2kinfosys.learnJava.inheritance;

public class ChildClass extends Parent{
	

	String commonVariable = "ChildClass Something common";
	
	public ChildClass() {
		super("Sample");
		System.out.println("Child Class Constructor");
	}
	
	public ChildClass(String firstName) {
		this();
		System.out.println("Child Class Constructor with Arguments ");
	}
	// Removing visibility from Parent - overriding
	/*
	 * Rules of Overriding - Java - @override
	 * 1. Methods name exactly same
	 * 2. Return type - covariant (inherited parent child classes)
	 * 3. Access Modifier - Cannot reduce but increase the visibility of the inherited method from Parent
	 * 4. Parameters - should exactly
	 * 5. Exception - covarient (but we will see it later)
	 */
	@Override
	public ChildClass importantMethod(int something) {
		System.out.println("Important for Child :: " + something);
		return null;
	}

	void accessVariables() {
		System.out.println(protectedString);
		System.out.println(defaultString);
		System.out.println(publicString);
	}
}
