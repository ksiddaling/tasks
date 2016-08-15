package com.shingu.dto;

import java.util.Date;

import com.shingu.model.EmployeeLogin;

public class EmployeeLoginTimedetailsDto {

	private int employeeLoginTimeId;
	private EmployeeLogin employeeLogin;
	private Date employeeLoginTime;
	private Date employeeLogoutTime;
	private String employeeLoginIp;

	public EmployeeLoginTimedetailsDto() {
		super();
		System.out.println("EmployeeLoginTimedetailsDto()");
	}

	@Override
	public String toString() {
		return "EmployeeLoginTimedetialsDto [employeeLoginTimeId="
				+ employeeLoginTimeId + ", employeeLogin=" + employeeLogin
				+ ", employeeLoginTime=" + employeeLoginTime
				+ ", employeeLogoutTime=" + employeeLogoutTime
				+ ", employeeLoginIp=" + employeeLoginIp + "]";
	}

	public int getEmployeeLoginTimeId() {
		return employeeLoginTimeId;
	}

	public void setEmployeeLoginTimeId(int employeeLoginTimeId) {
		this.employeeLoginTimeId = employeeLoginTimeId;
	}

	public EmployeeLogin getEmployeeLogin() {
		return employeeLogin;
	}

	public void setEmployeeLogin(EmployeeLogin employeeLogin) {
		this.employeeLogin = employeeLogin;
	}

	public Date getEmployeeLoginTime() {
		return employeeLoginTime;
	}

	public void setEmployeeLoginTime(Date employeeLoginTime) {
		this.employeeLoginTime = employeeLoginTime;
	}

	public Date getEmployeeLogoutTime() {
		return employeeLogoutTime;
	}

	public void setEmployeeLogoutTime(Date employeeLogoutTime) {
		this.employeeLogoutTime = employeeLogoutTime;
	}

	public String getEmployeeLoginIp() {
		return employeeLoginIp;
	}

	public void setEmployeeLoginIp(String employeeLoginIp) {
		this.employeeLoginIp = employeeLoginIp;
	}

}
