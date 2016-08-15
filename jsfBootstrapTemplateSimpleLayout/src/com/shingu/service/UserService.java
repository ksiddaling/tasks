package com.shingu.service;

import java.util.List;

import com.shingu.dto.EmployeeDto;

public interface UserService {

	public void createUser(int employeeId, int statusId, int genderId, int designationId, int roleId, String firstName,
			String middleName, String lastName, String loginName, String LoginPassword, String employeeDob,
			String bloodGroup, String addmissionDate, String lastModifiedDate, int emailTypeId, int phoneTypeId,
			int addressTypeId, String emailid, String phoneNumber, String addressLine1, String addressLine2,
			String district, String state, String pinCode, String securityQuestion, String securityAnswer);

	public List<EmployeeDto> getAllEmployee();

	public List<EmployeeDto> searchEmployee(String name);
}
