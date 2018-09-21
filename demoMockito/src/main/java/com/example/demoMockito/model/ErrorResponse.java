package com.example.demoMockito.model;

public class ErrorResponse extends Exception {
	/**
	 * author : luan tc 
	 * date : 09212018
	 */
	private static final long serialVersionUID = 1L;
	private int errorCode;
	private String message;

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
