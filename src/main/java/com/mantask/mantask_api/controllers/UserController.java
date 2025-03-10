package com.mantask.mantask_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mantask.mantask_api.DTOs.UserDTO;
import com.mantask.mantask_api.entities.User;
import com.mantask.mantask_api.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;
		
	@GetMapping("/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable("id") long id) {
		UserDTO dto = service.findById(id);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	


//	@GetMapping("/{id}/projects")
//	public Set<Project> findProjectsByUser(@PathVariable("id") int id) {
//		User user = service.findById(id);
//		return user.getProjects();
//	}
}
