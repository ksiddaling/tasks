package com.shingu.dto;

import java.util.HashSet;
import java.util.Set;

import com.shingu.model.Employee;

public class GenderDto {

	private int genderId;
	private String genderType;
	private Set<Employee> employees = new HashSet<Employee>(0);

	public GenderDto() {
		super();
		System.out.println("GenderDto()");
	}

	@Override
	public String toString() {
		return "GenderDto [genderId=" + genderId + ", genderType=" + genderType
				+ ", employees=" + employees + "]";
	}

	public int getGenderId() {
		return genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}

	public String getGenderType() {
		return genderType;
	}

	public void setGenderType(String genderType) {
		this.genderType = genderType;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
