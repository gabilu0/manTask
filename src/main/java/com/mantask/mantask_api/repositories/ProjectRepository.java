package com.mantask.mantask_api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mantask.mantask_api.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

	List<Project> findAll();

	Project findById(int id);
}
