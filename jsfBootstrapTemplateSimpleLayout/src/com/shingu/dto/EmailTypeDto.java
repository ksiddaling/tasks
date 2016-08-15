package com.shingu.dto;

import java.util.HashSet;
import java.util.Set;

import com.shingu.model.EmployeeEmail;

public class EmailTypeDto {

	private int emailTypeId;
	private String emailTypeName;
	private Set<EmployeeEmail> employeeEmails = new HashSet<EmployeeEmail>(0);

	public EmailTypeDto() {
		super();
		System.out.println("EmailTypeDto");
	}

	@Override
	public String toString() {
		return "EmailTypeDto [emailTypeId=" + emailTypeId + ", emailTypeName="
				+ emailTypeName + ", employeeEmails=" + employeeEmails + "]";
	}

	public int getEmailTypeId() {
		return emailTypeId;
	}

	public void setEmailTypeId(int emailTypeId) {
		this.emailTypeId = emailTypeId;
	}

	public String getEmailTypeName() {
		return emailTypeName;
	}

	public void setEmailTypeName(String emailTypeName) {
		this.emailTypeName = emailTypeName;
	}

	public Set<EmployeeEmail> getEmployeeEmails() {
		return employeeEmails;
	}

	public void setEmployeeEmails(Set<EmployeeEmail> employeeEmails) {
		this.employeeEmails = employeeEmails;
	}

}
