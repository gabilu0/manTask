package com.mantask.mantask_api.entities;

import java.util.List;

public class User implements Owner {
	private String name;
	private String surname;
	private String email;
	private String password;
	private List<Project> projects;
	private List<Group> groups;
	
	public User() {
		super();
	}
	
	public User(String name, String surname, String email, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
	}

	@Override
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public List<Group> getGroups() {
		return groups;
	}

}
