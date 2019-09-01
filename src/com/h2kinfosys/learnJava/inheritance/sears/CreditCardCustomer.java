package com.h2kinfosys.learnJava.inheritance.sears;
// You cannot create a Sub class of a Final Class
public final class CreditCardCustomer extends PreferredCustomer {
	
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

}
