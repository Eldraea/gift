package com.efreiproject.gift.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException {


	private static final long serialVersionUID = -1773212845186712003L;

	public StudentNotFoundException(String message) {
		super(message);
	}
}
