 package com.mantask.mantask_api.DTOs;


import java.util.List;

import com.mantask.mantask_api.entities.projections.UserProjection;

public record UserDTO(Long id,
					  String name,
					  String surname,
					  String email,
					  List<GroupDTO> groups) {
	
	public UserDTO(UserProjection projection, List<GroupDTO> groups) {
		this(projection.getId(),
			 projection.getName(),
			 projection.getSurname(),
			 projection.getEmail(),
			 groups);
		
	}
 
}
