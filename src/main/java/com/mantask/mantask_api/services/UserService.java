package com.mantask.mantask_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mantask.mantask_api.DTOs.GroupDTO;
import com.mantask.mantask_api.DTOs.UserDTO;
import com.mantask.mantask_api.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true)
	public UserDTO findById(long id) {
		List<GroupDTO> groups = repository.findGroupsByUser(id).stream().map(g -> new GroupDTO(g)).toList();
		UserDTO user = new UserDTO(repository.findUserById(id).get(), groups);
		return user;
	}
	
	
	
}
