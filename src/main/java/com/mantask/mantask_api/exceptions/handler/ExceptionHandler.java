package com.mantask.mantask_api.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mantask.mantask_api.DTOs.ApiError;
import com.mantask.mantask_api.exceptions.customs.UserNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(UserNotFoundException.class)
	private ResponseEntity<ApiError> UserNotFound(UserNotFoundException ex, HttpServletRequest request) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		String error = "resource not found";
		String message = ex.getMessage();
		String path = request.getRequestURI();
		
		ApiError response = new ApiError(status.value(), error, message, path);
		
		return ResponseEntity.status(status).body(response);
	
	}
}
