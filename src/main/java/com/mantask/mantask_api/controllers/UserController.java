package com.mantask.mantask_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mantask.mantask_api.DTOs.ApiResponse;
import com.mantask.mantask_api.DTOs.UserDTO;
import com.mantask.mantask_api.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/{id}")
	public ResponseEntity<ApiResponse<UserDTO>> findById(@PathVariable("id") long id) {
		UserDTO dto = service.findById(id);
		
		ApiResponse<UserDTO> response = new ApiResponse<>(HttpStatus.OK.value(), 
														"User " +id+" informations", 
														dto);
		
		return ResponseEntity.ok(response);
	}

//	@GetMapping("/{id}/projects")
//	public Set<Project> findProjectsByUser(@PathVariable("id") int id) {
//		User user = service.findById(id);
//		return user.getProjects();
//	}
}
