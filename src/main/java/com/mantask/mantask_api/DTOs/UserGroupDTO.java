package com.mantask.mantask_api.DTOs;

import com.mantask.mantask_api.entities.projections.UserGroupProjection;

public record UserGroupDTO(Long id, String name, String goal, String role) {

	public UserGroupDTO(UserGroupProjection projection) {
		this(projection.getId(), projection.getName(), projection.getGoal(), projection.getRole());
	}

}
