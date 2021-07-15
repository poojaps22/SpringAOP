package com.demo.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Task {

	@Value("${task.name}")
	private String taskName;

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(String taskName) {
		super();
		this.taskName = taskName;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public String toString() {
		return "TaskName = " + taskName + "\n";
	}
	
	
}
