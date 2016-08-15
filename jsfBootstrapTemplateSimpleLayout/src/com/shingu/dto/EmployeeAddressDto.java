package com.shingu.dto;

import com.shingu.model.AddressType;
import com.shingu.model.Employee;

public class EmployeeAddressDto {

	private int employeeAddressId;
	private Employee employee;
	private AddressType addressType;
	private String addressLine1;
	private String addressLine2;
	private String district;
	private String state;
	private String pinCode;

	public EmployeeAddressDto() {
		super();
		System.out.println("EmployeeAddressDto()");
	}

	@Override
	public String toString() {
		return "EmployeeAddressDto [employeeAddressId=" + employeeAddressId
				+ ", employee=" + employee + ", addressType=" + addressType
				+ ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", district=" + district + ", state=" + state
				+ ", pinCode=" + pinCode + "]";
	}

	public int getEmployeeAddressId() {
		return employeeAddressId;
	}

	public void setEmployeeAddressId(int employeeAddressId) {
		this.employeeAddressId = employeeAddressId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

}
