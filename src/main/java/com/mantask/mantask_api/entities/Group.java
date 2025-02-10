package com.mantask.mantask_api.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "groups")
public class Group implements Owner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;
	@Column(name = "goal")
	private String goal;

	@OneToMany
	@JoinTable(name = "group_projects", joinColumns = @JoinColumn(name = "id_group", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_project", referencedColumnName = "id"))
	private Set<Project> projects;

	@ManyToMany(mappedBy = "groups")
	@JsonBackReference
	private Set<User> partners;

	public Group(String name, String goal, Set<Project> projects, Set<User> partners) {
		super();
		this.name = name;
		this.goal = goal;
		this.projects = projects;
		this.partners = partners;
	}

	public Group() {
		super();
	}

	public String getName() {
		return name;
	}

	public String getGoal() {
		return goal;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public Set<User> getPartners() {
		return partners;
	}

}
