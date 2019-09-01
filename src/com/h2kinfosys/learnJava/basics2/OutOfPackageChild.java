package com.h2kinfosys.learnJava.basics2;

import com.h2kinfosys.learnJava.inheritance.Parent;

public class OutOfPackageChild extends Parent{
	
	public OutOfPackageChild() {
		super("Sample");
		System.out.println("OutOfPackageChild");
		
	}
	
	void accessVariables() {
		System.out.println(protectedString);
		//System.out.println(defaultString);
		System.out.println(publicString);
	}

}
