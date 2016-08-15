package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "contact_number")
	private String contactNumber;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "middle_name")
	private String middleName;

	// bi-directional many-to-one association to Task
	@OneToMany(mappedBy = "client")
	private List<Task> tasks;

	public Client() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Task addTask(Task task) {
		getTasks().add(task);
		task.setClient(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setClient(null);

		return task;
	}

	public Client(final String contactNumber, final String firstName, final String lastName, final String middleName) {
		super();
		this.contactNumber = contactNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}

}