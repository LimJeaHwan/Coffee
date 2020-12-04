package com.yuhan.coffee.exception;

public class AlreadyExistingIdException extends RuntimeException{
	
	public AlreadyExistingIdException(String message) {
		super(message);
	}
}
