package com.company.springboot.exception;

public class TrainerNotFoundByIdException extends RuntimeException{

	private String message;

	public TrainerNotFoundByIdException(String message) {
		
		this.message = message;
	}

	public String getMessage() {
		return message;
	}	
	
}
