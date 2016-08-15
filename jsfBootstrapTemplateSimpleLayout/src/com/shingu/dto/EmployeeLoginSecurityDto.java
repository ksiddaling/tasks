package com.shingu.dto;

import com.shingu.model.EmployeeLogin;

public class EmployeeLoginSecurityDto {

	private int employeeLoginSecurityId;
	private EmployeeLogin employeeLogin;
	private String securityQuestion;
	private String securityAnswer;

	public EmployeeLoginSecurityDto() {
		super();
		System.out.println("EmployeeLoginSecurityDto()");
	}

	@Override
	public String toString() {
		return "EmployeeLoginSecurityDto [employeeLoginSecurityId="
				+ employeeLoginSecurityId + ", employeeLogin=" + employeeLogin
				+ ", securityQuestion=" + securityQuestion
				+ ", securityAnswer=" + securityAnswer + "]";
	}

	public int getEmployeeLoginSecurityId() {
		return employeeLoginSecurityId;
	}

	public void setEmployeeLoginSecurityId(int employeeLoginSecurityId) {
		this.employeeLoginSecurityId = employeeLoginSecurityId;
	}

	public EmployeeLogin getEmployeeLogin() {
		return employeeLogin;
	}

	public void setEmployeeLogin(EmployeeLogin employeeLogin) {
		this.employeeLogin = employeeLogin;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

}
