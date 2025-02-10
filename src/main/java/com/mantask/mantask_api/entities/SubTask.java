package com.mantask.mantask_api.entities;

import com.mantask.mantask_api.entities.enums.StatusTask;

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
import jakarta.persistence.Table;

@Entity
@Table(name = "subtaks")
public class SubTask {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "description")
	private String description;

	@Enumerated(EnumType.STRING)
	private StatusTask status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "main_task")
	private Task mainTask;

	public SubTask() {
	}

	public SubTask(String description, StatusTask status, Task mainTask) {
		super();
		this.description = description;
		this.status = status;
		this.mainTask = mainTask;
	}

	public String getDescription() {
		return description;
	}

	public StatusTask getStatus() {
		return status;
	}

	public Task getMainTask() {
		return mainTask;
	}

}
