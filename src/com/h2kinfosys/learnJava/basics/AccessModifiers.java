package com.h2kinfosys.learnJava.basics;

public class AccessModifiers {

	// Access Modifiers are applicable to classes, methods and variables
	/* public - accessible to everyone 
	 * private - accessible only to declaration class
	 * protected - accessible to children
	 * default - accessible to package
	 */
	
	private String privateString = "Private String";
	public String publicString = "public String";
	protected String protectedString = "protected String";
	String defaultString = "Default String";
	
	public static void main(String[] args) {
		AccessModifiers access = new AccessModifiers();
		System.out.println(access.privateString);
		System.out.println(access.publicString);
		System.out.println(access.protectedString);
		System.out.println(access.defaultString);
	}
}
