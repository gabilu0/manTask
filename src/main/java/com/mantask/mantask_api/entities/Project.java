package com.mantask.mantask_api.entities;

import java.time.LocalDate;
import java.util.List;

import com.mantask.mantask_api.entities.enums.StatusProject;
import com.mantask.mantask_api.entities.enums.typeProject;

public class Project {
	private String name;
	private String description;
	private LocalDate startDate;
	private LocalDate endDate;
	private StatusProject status = StatusProject.EXECUÇÃO;
	private List<Task> tasks;
	private typeProject typeProject;
	private Owner owner;
	
	public Project(String name, String description, LocalDate startDate, LocalDate endDate) {
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public StatusProject getStatus() {
		return status;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public typeProject getTypeProject() {
		return typeProject;
	}

	public Owner getOwner() {
		return owner;
	}
	
	
}
