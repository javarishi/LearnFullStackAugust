package com.h2kinfosys.learnJava.inheritance;

public class Parent {
	
	// base class - Super class - parent class
	private String privateString = "Private String";
	public String publicString = "public String";
	protected String protectedString = "protected String";
	String defaultString = "Default String";
	
	String commonVariable = "Parent Something common";
	
	public Parent(String firstName) {
		System.out.println("Parent class contructor :: "+ firstName);
	}

	Parent importantMethod(int something) {
		System.out.println("Important for Parent :: " + something);
		return null;
	}
	
	public void accessDataPublic() {
		System.out.println("Some Data Access Method from Parent class accessDataPublic");
	}
	
	void accessDataDefault() {
		System.out.println("Some Data Access Method from Parent class accessDataDefault");
	}
	
	protected void accessDataProtected() {
		System.out.println("Some Data Access Method from Parent class accessDataProtected");
	}
}
