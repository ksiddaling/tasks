package com.shingu.dto;

import java.util.HashSet;
import java.util.Set;

import com.shingu.model.Employee;

public class RoleDto {
	private int roleId;
	private String roleName;
	private Set<Employee> employees = new HashSet<Employee>(0);

	public RoleDto() {
		super();
		System.out.println("RoleDto()");
	}

	@Override
	public String toString() {
		return "RoleDto [roleId=" + roleId + ", roleName=" + roleName
				+ ", employees=" + employees + "]";
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
