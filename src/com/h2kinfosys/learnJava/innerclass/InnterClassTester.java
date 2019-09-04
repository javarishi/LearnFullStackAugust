package com.h2kinfosys.learnJava.innerclass;


public class InnterClassTester {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		// Inner class - instance is created with instance of outer class
		OuterClass.InnerClass innerClass = outer.new InnerClass();
		innerClass.printVariables();
		// Static Inner Class - Instance is created with class Name
		OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
		staticInnerClass.printVariables();
	}

}
