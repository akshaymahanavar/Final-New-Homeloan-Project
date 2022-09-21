package com.wearefighters.homeloan.app.exception;

public class DataNotsavedException extends RuntimeException{

	public DataNotsavedException(String msg) {

		super(msg);
		System.out.println("in custom exception");
	}
}
