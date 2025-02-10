package com.mantask.mantask_api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mantask.mantask_api.entities.Project;
import com.mantask.mantask_api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findById(int id);

	List<User> findAll();

	List<Project> findByProjects(User user);

}