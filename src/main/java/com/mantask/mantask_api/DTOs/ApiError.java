package com.mantask.mantask_api.DTOs;

public record ApiError(int statusCode,
					   String error,
					   String message,
					   String path) {

}
