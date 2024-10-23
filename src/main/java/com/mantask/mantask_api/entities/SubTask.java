package com.mantask.mantask_api.entities;

import com.mantask.mantask_api.entities.enums.StatusTask;

public class SubTask {
	private String description;
	private StatusTask status;
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
