package com.h2kinfosys.learnJava.basics;

public class TestAccess {

	public static void main(String[] args) {
		AccessModifiers access = new AccessModifiers();
		//System.out.println(access.privateString);
		System.out.println(access.publicString);
		System.out.println(access.protectedString);
		System.out.println(access.defaultString);

	}

}
