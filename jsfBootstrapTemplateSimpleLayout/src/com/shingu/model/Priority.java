package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the priority database table.
 * 
 */
@Entity
@NamedQuery(name = "Priority.findAll", query = "SELECT p FROM Priority p")
public class Priority implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	// bi-directional many-to-one association to Task
	@OneToMany(mappedBy = "priority")
	private List<Task> tasks;

	public Priority() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Task addTask(Task task) {
		getTasks().add(task);
		task.setPriority(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setPriority(null);

		return task;
	}

	public Priority(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Priority(String name) {
		super();
		this.name = name;
	}

}