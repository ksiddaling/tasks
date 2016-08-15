package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "contact_number")
	private String contactNumber;

	private String email;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "password")
	private String password;

	// bi-directional many-to-one association to Task
	@OneToMany(mappedBy = "user1")
	private List<Task> tasks1;

	// bi-directional many-to-one association to Task
	@OneToMany(mappedBy = "user2")
	private List<Task> tasks2;

	public User() {
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public List<Task> getTasks1() {
		return this.tasks1;
	}

	public void setTasks1(List<Task> tasks1) {
		this.tasks1 = tasks1;
	}

	public Task addTasks1(Task tasks1) {
		getTasks1().add(tasks1);
		tasks1.setUser1(this);

		return tasks1;
	}

	public Task removeTasks1(Task tasks1) {
		getTasks1().remove(tasks1);
		tasks1.setUser1(null);

		return tasks1;
	}

	public List<Task> getTasks2() {
		return this.tasks2;
	}

	public void setTasks2(List<Task> tasks2) {
		this.tasks2 = tasks2;
	}

	public Task addTasks2(Task tasks2) {
		getTasks2().add(tasks2);
		tasks2.setUser2(this);

		return tasks2;
	}

	public Task removeTasks2(Task tasks2) {
		getTasks2().remove(tasks2);
		tasks2.setUser2(null);

		return tasks2;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String contactNumber, String email, String firstName, String lastName, String middleName,
			String password) {
		super();
		this.contactNumber = contactNumber;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.password = password;
	}

}