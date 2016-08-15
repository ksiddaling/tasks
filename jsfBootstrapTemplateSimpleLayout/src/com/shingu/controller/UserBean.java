package com.shingu.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shingu.dto.EmployeeDto;
import com.shingu.service.UserService;

@ManagedBean(name = "userBean")
@Scope("request")
@Component
public class UserBean implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -1058144724089304059L;
	private int employeeId;
	private int statusId;
	private int genderId;
	private int designationId;
	private int roleId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String employeeDob;
	private String bloodGroup;
	private String addmissionDate;
	private String lastModifiedDate;
	private EmployeeDto employeeDto;
	private int emailTypeId;
	private int phoneTypeId;
	private int addressTypeId;
	private String emailid;
	private String phoneNumber;
	private String addressLine1;
	private String addressLine2;
	private String district;
	private String state;
	private String pinCode;
	private String loginName;
	private String loginPassword;
	private String securityQuestion;
	private String securityAnswer;
	private List<EmployeeDto> allEmployee;

	@Autowired
	UserService userService;

	@Autowired
	private ApplicationBean applicationBean;

	public UserBean() {
		super();
		System.out.println("UserBean()");
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public int getGenderId() {
		return genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}

	public int getDesignationId() {
		return designationId;
	}

	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getEmployeeDob() {
		return employeeDob;
	}

	public void setEmployeeDob(String employeeDob) {
		this.employeeDob = employeeDob;
	}

	public String getAddmissionDate() {
		return addmissionDate;
	}

	public void setAddmissionDate(String addmissionDate) {
		this.addmissionDate = addmissionDate;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public int getEmailTypeId() {
		return emailTypeId;
	}

	public void setEmailTypeId(int emailTypeId) {
		this.emailTypeId = emailTypeId;
	}

	public int getPhoneTypeId() {
		return phoneTypeId;
	}

	public void setPhoneTypeId(int phoneTypeId) {
		this.phoneTypeId = phoneTypeId;
	}

	public int getAddressTypeId() {
		return addressTypeId;
	}

	public void setAddressTypeId(int addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public ApplicationBean getApplicationBean() {
		return applicationBean;
	}

	public void setApplicationBean(ApplicationBean applicationBean) {
		this.applicationBean = applicationBean;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public List<EmployeeDto> getAllEmployee() {
		if (firstName == null) {
			allEmployee = userService.getAllEmployee();
		} else {
			userService.searchEmployee(firstName);
		}
		for (EmployeeDto d : allEmployee) {
			System.out.println(d.getFirstName());
		}
		return allEmployee;
	}

	public void setAllEmployee(List<EmployeeDto> allEmployee) {
		this.allEmployee = allEmployee;
	}

	public String createUser() {
		System.out.println("createUser starts.......................");
		userService.createUser(employeeId, statusId, genderId, designationId,
				roleId, firstName, middleName, lastName, loginName,
				loginPassword, employeeDob, bloodGroup, addmissionDate,
				lastModifiedDate, emailTypeId, phoneTypeId, addressTypeId,
				emailid, phoneNumber, addressLine1, addressLine2, district,
				state, pinCode, securityQuestion, securityAnswer);

		System.out.println(".........................createUser ends");
		return "success";
	}

	public void firstNameChanged(ValueChangeEvent valueChangeEvent) {
		System.out
				.println("firstNameChanged(ValueChangeEvent valueChangeEvent) starts :"
						+ valueChangeEvent.getNewValue().toString());
		setFirstName(valueChangeEvent.getNewValue().toString());
		searchUser();
		System.out
				.println("firstNameChanged(ValueChangeEvent valueChangeEvent) ends : "
						+ getFirstName());
	}

	public String searchUser() {
		System.out.println("empname from searchUser is : " + firstName);
		setAllEmployee(userService.searchEmployee(firstName));
		return null;
	}

	public String deleteUser() {

		return null;
	}
}
