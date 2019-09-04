package com.h2kinfosys.learnJava.innerclass;

public class LocalInnerClass {

	public static void main(String[] args) {
		LocalInnerClass local = new LocalInnerClass();
		local.localTesterMethod("Smyrna", "30080");

	}
	
	public void localTesterMethod(String city, String zipCode) {
		// Local class
		class TieUpCityAndZipCode{
			private String checkString = "Test";
			public boolean checkValidCityVsZipCode() {
				System.out.println("City :: " + city);
				System.out.println("ZipCode :: " + zipCode);
				return true;
			}
		}
		
		TieUpCityAndZipCode check = new TieUpCityAndZipCode();
		boolean output = check.checkValidCityVsZipCode();
		System.out.println(check.checkString);
		if(output) System.out.println("City and Zipcode provided are valid");
	}

}
