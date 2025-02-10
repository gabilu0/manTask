package com.mantask.mantask_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mantask.mantask_api.entities.Project;
import com.mantask.mantask_api.repositories.ProjectRepository;

@Service("ps")
public class ProjectService {

	@Autowired
	private ProjectRepository repo;

	public Project findById(int id) {
		return repo.findById(id);
	}

}
