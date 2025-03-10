package com.mantask.mantask_api.DTOs;

import com.mantask.mantask_api.entities.projections.GroupMinProjection;

public record GroupDTO(Long id,
					   String name, 
					   String goal) {
	
	public GroupDTO(GroupMinProjection projection) {
		this(projection.getId(),
			 projection.getName(),
			 projection.getGoal());
	}

}
