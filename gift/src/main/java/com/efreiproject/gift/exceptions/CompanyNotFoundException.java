package com.efreiproject.gift.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class CompanyNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1352966507299755248L;

	public CompanyNotFoundException(String message) {
		super(message);
	}

}
