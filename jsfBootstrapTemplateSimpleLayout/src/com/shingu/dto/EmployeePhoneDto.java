package com.shingu.dto;

import com.shingu.model.Employee;
import com.shingu.model.PhoneType;

public class EmployeePhoneDto {

	private int employeePhoneId;
	private PhoneType phoneType;
	private Employee employee;
	private String phone;

	public EmployeePhoneDto() {
		super();
		System.out.println("EmployeePhoneDto()");
	}

	@Override
	public String toString() {
		return "EmployeePhoneDto [employeePhoneId=" + employeePhoneId
				+ ", phoneType=" + phoneType + ", employee=" + employee
				+ ", phone=" + phone + "]";
	}

	public int getEmployeePhoneId() {
		return employeePhoneId;
	}

	public void setEmployeePhoneId(int employeePhoneId) {
		this.employeePhoneId = employeePhoneId;
	}

	public PhoneType getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
