package com.mantask.mantask_api.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mantask.mantask_api.entities.Project;
import com.mantask.mantask_api.entities.User;
import com.mantask.mantask_api.entities.projections.UserGroupProjection;
import com.mantask.mantask_api.entities.projections.UserProjection;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = "SELECT id, name, surname, email FROM users WHERE id = :id", nativeQuery = true)
	UserProjection findUserById(@Param("id") long id);

	@Query(value = "SELECT g.id, g.name, g.goal, ug.ROLE FROM user_groups AS ug INNER JOIN groups g\r\n"
			+ "ON g.id = ug.id_group WHERE ug.id_user = :id", nativeQuery = true)
	List<UserGroupProjection> findGroupsByUser(@Param("id") long id);

	List<User> findAll();

	List<Project> findByProjects(User user);

}