package com.mantask.mantask_api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mantask.mantask_api.entities.Group;
import com.mantask.mantask_api.entities.Project;

public interface GroupRepository extends JpaRepository<Group, Long> {

	Group findById(long id);

	List<Group> findAll();

	List<Project> findByProjects(Group group);
}
