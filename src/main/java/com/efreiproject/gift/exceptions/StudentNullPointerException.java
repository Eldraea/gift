package com.efreiproject.gift.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class StudentNullPointerException extends RuntimeException {

	private static final long serialVersionUID = 5864527989196369780L;

	public StudentNullPointerException(String message) {
		super(message);
	}
}
