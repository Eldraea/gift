package com.efreiproject.gift.exceptions;

public class StudentAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = -4453055809780247777L;
	
	public StudentAlreadyExistsException(String message) {
		super(message);
	}

}
