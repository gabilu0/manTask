package com.mantask.mantask_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mantask.mantask_api.DTOs.UserDTO;
import com.mantask.mantask_api.DTOs.UserGroupDTO;
import com.mantask.mantask_api.entities.projections.UserProjection;
import com.mantask.mantask_api.exceptions.customs.UserNotFoundException;
import com.mantask.mantask_api.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	@Transactional(readOnly = true)
	public UserDTO findById(long id) {
		List<UserGroupDTO> groups = repository.findGroupsByUser(id).stream().map(g -> new UserGroupDTO(g)).toList();
		UserProjection userProjection = repository.findUserById(id);
		
		if(userProjection == null) {
			throw new UserNotFoundException("User not found");
		}
		
		UserDTO user = new UserDTO(userProjection, groups);
		return user;
	}

}
