package com.mantask.mantask_api.entities;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.mantask.mantask_api.entities.enums.StatusTask;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "start_date")
	private LocalDate startDate;
	@Column(name = "end_date")
	private LocalDate endDate;

	@Enumerated(EnumType.STRING)
	private StatusTask status;

	@ManyToOne
	@JoinColumn(name = "id_project")
	private Project project;

	@OneToMany(mappedBy = "mainTask", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<SubTask> subTasks;

	public Task() {
	}

	public Task(String title, String description, LocalDate startDate, LocalDate endDate) {
		super();
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public StatusTask getStatus() {
		return status;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public Project getProject() {
		return project;
	}

	public Set<SubTask> getSubTasks() {
		return subTasks;
	}

}
