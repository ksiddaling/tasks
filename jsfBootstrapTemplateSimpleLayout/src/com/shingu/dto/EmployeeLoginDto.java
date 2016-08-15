package com.shingu.dto;

import java.util.HashSet;
import java.util.Set;

import com.shingu.model.Employee;
import com.shingu.model.EmployeeLoginSecurity;
import com.shingu.model.EmployeeLoginTimedetails;
import com.shingu.model.Status;

public class EmployeeLoginDto {

	private int employeeLoginId;
	private Employee employee;
	private Status statusByStatusId;
	private Status statusByAuthenticationStatusId;
	private String employeeLoginName;
	private String employeePassword;
	private String employeeModificationPassword;
	private int loginAttempts;
	private Set<EmployeeLoginSecurity> employeeLoginSecurities = new HashSet<EmployeeLoginSecurity>(
			0);
	private Set<EmployeeLoginTimedetails> employeeLoginTimedetailses = new HashSet<EmployeeLoginTimedetails>(
			0);

	@Override
	public String toString() {
		return "EmployeeLoginDto [employeeLoginId=" + employeeLoginId
				+ ", employee=" + employee + ", statusByStatusId="
				+ statusByStatusId + ", statusByAuthenticationStatusId="
				+ statusByAuthenticationStatusId + ", employeeLoginName="
				+ employeeLoginName + ", employeePassword=" + employeePassword
				+ ", employeeModificationPassword="
				+ employeeModificationPassword + ", loginAttempts="
				+ loginAttempts + ", employeeLoginSecurities="
				+ employeeLoginSecurities + ", employeeLoginTimedetailses="
				+ employeeLoginTimedetailses + "]";
	}

	public EmployeeLoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeLoginId() {
		return employeeLoginId;
	}

	public void setEmployeeLoginId(int employeeLoginId) {
		this.employeeLoginId = employeeLoginId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Status getStatusByStatusId() {
		return statusByStatusId;
	}

	public void setStatusByStatusId(Status statusByStatusId) {
		this.statusByStatusId = statusByStatusId;
	}

	public Status getStatusByAuthenticationStatusId() {
		return statusByAuthenticationStatusId;
	}

	public void setStatusByAuthenticationStatusId(
			Status statusByAuthenticationStatusId) {
		this.statusByAuthenticationStatusId = statusByAuthenticationStatusId;
	}

	public String getEmployeeLoginName() {
		return employeeLoginName;
	}

	public void setEmployeeLoginName(String employeeLoginName) {
		this.employeeLoginName = employeeLoginName;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	public String getEmployeeModificationPassword() {
		return employeeModificationPassword;
	}

	public void setEmployeeModificationPassword(
			String employeeModificationPassword) {
		this.employeeModificationPassword = employeeModificationPassword;
	}

	public int getLoginAttempts() {
		return loginAttempts;
	}

	public void setLoginAttempts(int loginAttempts) {
		this.loginAttempts = loginAttempts;
	}

	public Set<EmployeeLoginSecurity> getEmployeeLoginSecurities() {
		return employeeLoginSecurities;
	}

	public void setEmployeeLoginSecurities(
			Set<EmployeeLoginSecurity> employeeLoginSecurities) {
		this.employeeLoginSecurities = employeeLoginSecurities;
	}

	public Set<EmployeeLoginTimedetails> getEmployeeLoginTimedetailses() {
		return employeeLoginTimedetailses;
	}

	public void setEmployeeLoginTimedetailses(
			Set<EmployeeLoginTimedetails> employeeLoginTimedetailses) {
		this.employeeLoginTimedetailses = employeeLoginTimedetailses;
	}

}
