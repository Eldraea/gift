package com.efreiproject.gift.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class TutorNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 626736997477711104L;

	public TutorNotFoundException(String message) {
		super(message);
	}
}