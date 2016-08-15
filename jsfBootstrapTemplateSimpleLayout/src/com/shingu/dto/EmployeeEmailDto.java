package com.shingu.dto;

import com.shingu.model.EmailType;
import com.shingu.model.Employee;

public class EmployeeEmailDto {

	private int employeeEmailId;
	private Employee employee;
	private EmailType emailType;
	private String employeeEmail;

	public EmployeeEmailDto() {
		super();
		System.out.println("EmployeeEmailDto()");
	}

	@Override
	public String toString() {
		return "EmployeeEmailDto [employeeEmailId=" + employeeEmailId
				+ ", employee=" + employee + ", emailType=" + emailType
				+ ", employeeEmail=" + employeeEmail + "]";
	}

	public int getEmployeeEmailId() {
		return employeeEmailId;
	}

	public void setEmployeeEmailId(int employeeEmailId) {
		this.employeeEmailId = employeeEmailId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmailType getEmailType() {
		return emailType;
	}

	public void setEmailType(EmailType emailType) {
		this.emailType = emailType;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

}
