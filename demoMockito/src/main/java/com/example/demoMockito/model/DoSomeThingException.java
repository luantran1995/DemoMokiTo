package com.example.demoMockito.model;

public class DoSomeThingException extends Exception{
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public DoSomeThingException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public DoSomeThingException() {
		super();
	}
}
