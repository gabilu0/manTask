package com.mantask.mantask_api.exceptions.customs;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message) {
		super(message);
	}

}
