package com.mantask.mantask_api.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mantask.mantask_api.entities.Project;
import com.mantask.mantask_api.entities.User;
import com.mantask.mantask_api.repositories.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository repository;

	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable("id") int id) {
		User user = repository.findById(id);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@GetMapping
	public List<User> findAll() {
		return repository.findAll();
	}

	@GetMapping("/{id}/projects")
	public Set<Project> findProjectsByUser(@PathVariable("id") int id) {
		User user = repository.findById(id);
		return user.getProjects();
	}
}
