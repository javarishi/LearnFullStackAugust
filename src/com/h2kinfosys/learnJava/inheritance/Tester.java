package com.h2kinfosys.learnJava.inheritance;

/*
 * 1. Creating Parent Child relations
 * 2. Constructor calling - super (this)
 * 3. Protected variables
 */
public class Tester {

	public static void main(String[] args) {
		Parent parent = new Parent("Parent");
	
		
		ChildClass child = new ChildClass("This is another constructor");
		child.accessDataPublic();
		child.accessDataProtected();
		child.accessDataDefault();
		child.accessVariables();
		child.importantMethod(100); // you will call child class methods 
		System.out.println(child.commonVariable);
		// You can create - Child class instance with Parent class Reference
		// ReferenceType objectName = new InstanceType()
		Parent testChild = new ChildClass();
		/*
		 * Interview Tip:
		 *  visibility is dependent on Reference type
		 *  Functionality will be called from InstanceType
		 */
		testChild.importantMethod(100); 
		
		/*
		 * Interview Tip: Variables in Java do not follow polymorphism 
		 * and overriding is only applicable to methods, not variables
		 */
		System.out.println(testChild.commonVariable);
		/*
		 * Interview Tip: If same variable accessed thru child class
		 * concept variable hiding  
		 */
		System.out.println(child.commonVariable);
		
		

	}

}
