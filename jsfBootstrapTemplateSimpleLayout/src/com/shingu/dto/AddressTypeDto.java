package com.shingu.dto;

import java.util.HashSet;
import java.util.Set;

import com.shingu.model.EmployeeAddress;

public class AddressTypeDto {
	
	private int addressTypeId;
	private String addressType;
	private Set<EmployeeAddress> employeeAddresses = new HashSet<EmployeeAddress>(
			0);

	@Override
	public String toString() {
		return "AddressType [addressTypeId=" + addressTypeId + ", addressType="
				+ addressType + ", employeeAddresses=" + employeeAddresses
				+ "]";
	}

	public AddressTypeDto() {
		super();
		System.out.println("AddressType");
	}

	public int getAddressTypeId() {
		return addressTypeId;
	}

	public void setAddressTypeId(int addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public Set<EmployeeAddress> getEmployeeAddresses() {
		return employeeAddresses;
	}

	public void setEmployeeAddresses(Set<EmployeeAddress> employeeAddresses) {
		this.employeeAddresses = employeeAddresses;
	}

}
