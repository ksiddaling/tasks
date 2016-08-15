package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the task_details_history database table.
 * 
 */
@Entity
@Table(name = "task_details_history")
@NamedQuery(name = "TaskDetailsHistory.findAll", query = "SELECT t FROM TaskDetailsHistory t")
public class TaskDetailsHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Lob
	@Column(name = "detail", length = 3000)
	private Object detail;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "detail_update_time")
	private Date detailUpdateTime;

	// bi-directional many-to-one association to Task
	@OneToMany(mappedBy = "taskDetailsHistory")
	private List<Task> tasks;

	// bi-directional many-to-one association to Task
	@ManyToOne
	private Task task;

	public TaskDetailsHistory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Object getDetail() {
		return this.detail;
	}

	public void setDetail(Object detail) {
		this.detail = detail;
	}

	public Date getDetailUpdateTime() {
		return this.detailUpdateTime;
	}

	public void setDetailUpdateTime(Date detailUpdateTime) {
		this.detailUpdateTime = detailUpdateTime;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Task addTask(Task task) {
		getTasks().add(task);
		task.setTaskDetailsHistory(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setTaskDetailsHistory(null);

		return task;
	}

	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}