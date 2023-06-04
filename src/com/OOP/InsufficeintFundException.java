package com.OOP;

public class InsufficeintFundException extends Exception {
	double amt;

	public InsufficeintFundException(double amt) {
		super();
		this.amt = amt;
	}

}
