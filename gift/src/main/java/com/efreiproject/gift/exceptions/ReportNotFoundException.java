package com.efreiproject.gift.exceptions;

public class ReportNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1909610412889144946L;
	
	public ReportNotFoundException(String message) {
		super(message);
	}

}
