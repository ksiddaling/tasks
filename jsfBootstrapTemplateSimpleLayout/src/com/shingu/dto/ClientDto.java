package com.shingu.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.shingu.model.Task;

public class ClientDto {

	private int id;
	private String contactNumber;
	private String firstName;
	private String lastName;
	private String middleName;
	private List<Task> tasks;

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

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public ClientDto() {
		super();
	}

	public ClientDto(int id, String contactNumber, String firstName, String lastName, String middleName) {
		super();
		this.id = id;
		this.contactNumber = contactNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}

	@Override
	public String toString() {
		return "ClientDto [id=" + id + ", contactNumber=" + contactNumber + ", firstName=" + firstName + ", lastName="
				+ lastName + ", middleName=" + middleName + ", tasks=" + tasks + "]";
	}

}
