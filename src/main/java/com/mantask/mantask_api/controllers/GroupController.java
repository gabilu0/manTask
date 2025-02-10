package com.mantask.mantask_api.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mantask.mantask_api.entities.Group;
import com.mantask.mantask_api.entities.Project;
import com.mantask.mantask_api.repositories.GroupRepository;

@RestController
@RequestMapping("/group")
public class GroupController {

	@Autowired
	private GroupRepository repository;

	@GetMapping
	public List<Group> HeloWorld() {
		return repository.findAll();
	}

	@GetMapping("/{id}")
	public Group findById(@PathVariable("id") int id) {
		return repository.findById(id);
	}

	@GetMapping("/{id}/projects")
	public Set<Project> findProjectsByGroup(@PathVariable("id") int id) {
		Group group = repository.findById(id);
		return group.getProjects();
	}
}
