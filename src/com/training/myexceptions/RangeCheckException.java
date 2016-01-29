package com.training.myexceptions;

//checked exception - because extending exception
public class RangeCheckException extends Exception {
	private long handPhone;
	
	//mandatory dependency
	public RangeCheckException(long handPhone) {
		super();
		this.handPhone = handPhone;
	}

	//overriding super class method
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return handPhone + "should be a 10 digit number ";
	}
	
	
}
