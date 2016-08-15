package com.shingu.dto;

import java.util.List;

import com.shingu.model.Task;

public class UserDto {

	private int id;
	private String contactNumber;
	private String email;
	private String firstName;
	private String lastName;
	private String middleName;
	private String password;
	private List<Task> tasks1;
	private List<Task> tasks2;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Task> getTasks1() {
		return tasks1;
	}

	public void setTasks1(List<Task> tasks1) {
		this.tasks1 = tasks1;
	}

	public List<Task> getTasks2() {
		return tasks2;
	}

	public void setTasks2(List<Task> tasks2) {
		this.tasks2 = tasks2;
	}

	public UserDto() {
		super();
	}

	public UserDto(String contactNumber, String email, String firstName, String lastName, String middleName,
			String password) {
		super();
		this.contactNumber = contactNumber;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.password = password;
	}

	public UserDto(int id, String contactNumber, String email, String firstName, String lastName, String middleName,
			String password, List<Task> tasks1, List<Task> tasks2) {
		super();
		this.id = id;
		this.contactNumber = contactNumber;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.password = password;
		this.tasks1 = tasks1;
		this.tasks2 = tasks2;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", contactNumber=" + contactNumber + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName + ", middleName=" + middleName + ", password=" + password
				+ ", tasks1=" + tasks1 + ", tasks2=" + tasks2 + "]";
	}

}
