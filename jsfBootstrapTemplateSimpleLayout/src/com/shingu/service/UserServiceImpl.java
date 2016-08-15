package com.shingu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shingu.dao.UserDao;
import com.shingu.dto.EmployeeDto;
import com.shingu.mapper.UserMapper;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void createUser(int employeeId, int statusId, int genderId,
			int designationId, int roleId, String firstName, String middleName,
			String lastName, String loginName, String loginPassword,
			String employeeDob, String bloodGroup, String addmissionDate,
			String lastModifiedDate, int emailTypeId, int phoneTypeId,
			int addressTypeId, String emailid, String phoneNumber,
			String addressLine1, String addressLine2, String district,
			String state, String pinCode, String securityQuestion,
			String securityAnswer) {

		System.out.println("user service starts...........");

		userDao.createUser(UserMapper.createUser(employeeId, statusId,
				genderId, designationId, roleId, firstName, middleName,
				lastName, loginName, loginPassword, employeeDob, bloodGroup,
				addmissionDate, lastModifiedDate, emailTypeId, phoneTypeId,
				addressTypeId, emailid, phoneNumber, addressLine1,
				addressLine2, district, state, pinCode, securityQuestion,
				securityAnswer));

		System.out.println(".............user service ends");
	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		System.out.println("getAllEmployee()");
		return userDao.getAllEmployee();
	}

	@Override
	public List<EmployeeDto> searchEmployee(String name) {
		System.out.println("searchEmployee service");
		return userDao.searchEmployee(name);
	}

}
