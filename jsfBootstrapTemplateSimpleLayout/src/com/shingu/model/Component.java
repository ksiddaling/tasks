package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the component database table.
 * 
 */
@Entity
@NamedQuery(name = "Component.findAll", query = "SELECT c FROM Component c")
public class Component implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	// bi-directional many-to-one association to Task
	@OneToMany(mappedBy = "component")
	private List<Task> tasks;

	public Component() {
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
		task.setComponent(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setComponent(null);

		return task;
	}

	public Component(String name) {
		super();
		this.name = name;
	}

	public Component(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}