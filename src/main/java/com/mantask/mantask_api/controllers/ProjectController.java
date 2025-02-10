package com.mantask.mantask_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mantask.mantask_api.entities.Owner;
import com.mantask.mantask_api.entities.Project;
import com.mantask.mantask_api.repositories.ProjectRepository;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private ProjectRepository repository;

	@GetMapping
	public List<Project> HeloWorld() {
		return repository.findAll();
	}

	@GetMapping("/{id}")
	public Project findById(@PathVariable("id") int id) {
		return repository.findById(id);
	}
}
