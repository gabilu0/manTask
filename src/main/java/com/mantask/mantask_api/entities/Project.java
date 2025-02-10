package com.mantask.mantask_api.entities;

import java.time.LocalDate;
import java.util.Set;

import com.mantask.mantask_api.entities.enums.StatusProject;
import com.mantask.mantask_api.entities.enums.typeProject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "projects")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "start_date")
	private LocalDate startDate;
	@Column(name = "end_date")
	private LocalDate endDate;

	@Enumerated(EnumType.STRING)
	private StatusProject status = StatusProject.EXECUCAO;
	@Enumerated(EnumType.STRING)
	private typeProject typeProject;

	@OneToMany(mappedBy = "project")
	private Set<Task> tasks;

	public Project() {
	}

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

	public Set<Task> getTasks() {
		return tasks;
	}

	public typeProject getTypeProject() {
		return typeProject;
	}

}
