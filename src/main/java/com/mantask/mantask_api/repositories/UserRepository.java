package com.mantask.mantask_api.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mantask.mantask_api.entities.Project;
import com.mantask.mantask_api.entities.User;
import com.mantask.mantask_api.entities.projections.GroupMinProjection;
import com.mantask.mantask_api.entities.projections.UserProjection;

public interface UserRepository extends JpaRepository<User, Long> {

	
	@Query(value = "SELECT id, name, surname, email FROM users WHERE id = :id", nativeQuery = true)
	Optional<UserProjection> findUserById(@Param("id") long id);
	
	@Query(value = "SELECT g.id, g.name, g.goal\r\n"
			+ "FROM users AS u INNER JOIN user_groups AS ug ON ug.id_user = u.id\r\n"
			+ "INNER JOIN groups g ON ug.ID_group = g.id WHERE u.id = :id ORDER BY g.id", nativeQuery = true)
	List<GroupMinProjection> findGroupsByUser(@Param("id") long id);

	List<User> findAll();

	List<Project> findByProjects(User user);  

}