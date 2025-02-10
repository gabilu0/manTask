package com.mantask.mantask_api.entities;

import com.mantask.mantask_api.entities.enums.RoleUser;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_groups")
public class UserGroup {

	@EmbeddedId
	private UserGroupId id = new UserGroupId();

	@ManyToOne
	@MapsId("userId")
	@JoinColumn(name = "id_user")
	private User user;
	@ManyToOne
	@MapsId("groupId")
	@JoinColumn(name = "id_group")
	private Group group;

	@Enumerated(EnumType.STRING)
	private RoleUser role;

	public UserGroup(UserGroupId id, User user, Group group, RoleUser role) {
		super();
		this.id = id;
		this.user = user;
		this.group = group;
		this.role = role;
	}

	public UserGroup() {
		super();
	}

}
