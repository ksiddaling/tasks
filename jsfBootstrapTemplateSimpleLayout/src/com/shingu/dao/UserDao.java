package com.shingu.dao;

import java.util.List;

import com.shingu.dto.EmployeeDto;
import com.shingu.model.Employee;

public interface UserDao {

	public void createUser(Employee employee);

	public List<EmployeeDto> getAllEmployee();

	public List<EmployeeDto> searchEmployee(String name);

}
