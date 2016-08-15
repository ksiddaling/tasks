package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the task_status_history database table.
 * 
 */
@Entity
@Table(name="task_status_history")
@NamedQuery(name="TaskStatusHistory.findAll", query="SELECT t FROM TaskStatusHistory t")
public class TaskStatusHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="status_update_time")
	private Date statusUpdateTime;

	//bi-directional many-to-one association to Task
	@ManyToOne
	private Task task;

	public TaskStatusHistory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStatusUpdateTime() {
		return this.statusUpdateTime;
	}

	public void setStatusUpdateTime(Date statusUpdateTime) {
		this.statusUpdateTime = statusUpdateTime;
	}

	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}