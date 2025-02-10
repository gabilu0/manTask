package com.mantask.mantask_api.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class UserGroupId {

	private Long userId;
	private Long groupId;

	@Override
	public int hashCode() {
		return Objects.hash(groupId, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserGroupId other = (UserGroupId) obj;
		return Objects.equals(groupId, other.groupId) && Objects.equals(userId, other.userId);
	}

}
