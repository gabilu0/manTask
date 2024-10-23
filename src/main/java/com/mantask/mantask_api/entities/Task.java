package com.mantask.mantask_api.entities;

import java.time.LocalDate;
import java.util.List;

import com.mantask.mantask_api.entities.enums.StatusTask;

public class Task {
	private String title;
	private String description;
	private StatusTask status;
	private LocalDate startDate;
	private LocalDate endDate;
	private Project project;
	private List<SubTask> subTasks;
	
	public Task() {}
	
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

	public List<SubTask> getSubTasks() {
		return subTasks;
	}

	

	

}
