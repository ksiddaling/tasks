package com.shingu.model;

import java.util.HashSet; 
import java.util.Set;

public class DesignationDto {

	private int designationId;
	private String designationName;
	private Set<Employee> employees = new HashSet<Employee>(0);

	public DesignationDto() {
		super();
		System.out.println("DesignationDto()");
	}

	@Override
	public String toString() {
		return "DesignationDto [designationId=" + designationId
				+ ", designationName=" + designationName + ", employees="
				+ employees + "]";
	}

	public int getDesignationId() {
		return designationId;
	}

	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}

	public String getDesignationName() {
		return designationName;
	}

	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
