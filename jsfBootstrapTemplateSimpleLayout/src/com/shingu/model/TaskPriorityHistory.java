package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the task_priority_history database table.
 * 
 */
@Entity
@Table(name="task_priority_history")
@NamedQuery(name="TaskPriorityHistory.findAll", query="SELECT t FROM TaskPriorityHistory t")
public class TaskPriorityHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="priority_update_time")
	private Date priorityUpdateTime;

	//bi-directional many-to-one association to Task
	@ManyToOne
	private Task task;

	public TaskPriorityHistory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPriorityUpdateTime() {
		return this.priorityUpdateTime;
	}

	public void setPriorityUpdateTime(Date priorityUpdateTime) {
		this.priorityUpdateTime = priorityUpdateTime;
	}

	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}