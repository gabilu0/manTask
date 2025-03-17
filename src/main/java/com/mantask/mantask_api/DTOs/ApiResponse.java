package com.mantask.mantask_api.DTOs;


public record ApiResponse<T>(int status,
						  String message,
						  T data) {

}
