package com.h2kinfosys.learnJava.inheritance.sears;

public class PreferredCustomer extends Customer {
	
	private String email = null;
	
	public PreferredCustomer(String customerEmail) {
		System.out.println("Preferred Customer Constructor");
		this.email = customerEmail;
	}

	
	@Override
	public boolean validateAddress(String address) {
		boolean result = false;
		result = super.validateAddress(address);
		if(result) {
			if(email != null 
					&& email.trim().length() > 0
					&& email.indexOf("@") > -1)	{
				result = true;
			}else {
				result = false;
			}
		}
		return result;
	}


	@Override
	public void checkCreditReport(String ssnNumber) {
		System.out.println(Reachable.companyName);
		if(ssnNumber != null) {
			System.out.println("Validation");
		}
		
	}
}
