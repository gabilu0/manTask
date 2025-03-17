package com.mantask.mantask_api.entities.enums;

public enum RoleUser {
	LIDER("Líder"), GESTOR("Gestor"), COLABORADOR("Colaborador");

	private String role;

	RoleUser(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}
}
