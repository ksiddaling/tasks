package com.shingu.dto;

import java.util.HashSet;
import java.util.Set;

import com.shingu.model.EmployeePhone;

public class PhoneTypeDto {
	private int phoneTypeId;
	private String phoneTypeName;
	private Set<EmployeePhone> employeePhones = new HashSet<EmployeePhone>(0);

	public PhoneTypeDto() {
		super();
		System.out.println("PhoneTypeDto()");
	}

	@Override
	public String toString() {
		return "PhoneTypeDto [phoneTypeId=" + phoneTypeId + ", phoneTypeName="
				+ phoneTypeName + ", employeePhones=" + employeePhones + "]";
	}

	public int getPhoneTypeId() {
		return phoneTypeId;
	}

	public void setPhoneTypeId(int phoneTypeId) {
		this.phoneTypeId = phoneTypeId;
	}

	public String getPhoneTypeName() {
		return phoneTypeName;
	}

	public void setPhoneTypeName(String phoneTypeName) {
		this.phoneTypeName = phoneTypeName;
	}

	public Set<EmployeePhone> getEmployeePhones() {
		return employeePhones;
	}

	public void setEmployeePhones(Set<EmployeePhone> employeePhones) {
		this.employeePhones = employeePhones;
	}

}
