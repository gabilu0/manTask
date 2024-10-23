package com.mantask.mantask_api.entities;

import java.util.List;

public class Group {
	private String name;
	private String goal;
	private List<Project> projects;
	private List<User> partners;
	private User owner;
	
	public Group(String name, String goal, List<Project> projects, List<User> partners, User owner) {
		super();
		this.name = name;
		this.goal = goal;
		this.projects = projects;
		this.partners = partners;
		this.owner = owner;
	}
	
	public String getName() {
		return name;
	}

	public String getGoal() {
		return goal;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public List<User> getPartners() {
		return partners;
	}

	public User getOwner() {
		return owner;
	}
	
	public Group() {
		super();
	}

	
}
