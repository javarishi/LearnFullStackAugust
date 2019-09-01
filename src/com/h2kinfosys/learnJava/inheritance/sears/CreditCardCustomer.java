package com.h2kinfosys.learnJava.inheritance.sears;

import java.io.Serializable;

// You cannot create a Sub class of a Final Class
// You can achieve multiple inheritance - implement more than one interface in single class
public final class CreditCardCustomer extends PreferredCustomer implements Serializable {
	
	private String validCreditCard = null;
	
	public CreditCardCustomer(String emailAddress, String validCreditCard) {
		super(emailAddress);
		this.validCreditCard = validCreditCard;
	}
	
	@Override
	public boolean validateAddress(String address) {
		boolean parentCheck = super.validateAddress(address);
		boolean result = false;
		if(parentCheck) {
			if(googleMapAddressChecker(address)) {
				if(validCreditCard != null 
						&& validCreditCard.trim().length() > 14
						&& validCreditCard.trim().length() <= 16) {
					long checkNumeric = Long.parseLong(validCreditCard);
					result = true;
				}
			}
		}
		return  result;
	}
	
	private boolean googleMapAddressChecker(String address) {
		return true;
	}

	
	@Override
	public void secondDefault() {
		// TODO Auto-generated method stub
		super.secondDefault();
	}
}
