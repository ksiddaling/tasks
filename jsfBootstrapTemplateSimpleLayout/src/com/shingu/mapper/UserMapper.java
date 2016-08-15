package com.shingu.mapper;

import java.util.ArrayList;
import java.util.List;

import com.shingu.dto.UserDto;
import com.shingu.model.Employee;
import com.shingu.model.User;

public class UserMapper {

	public static User createTasksUser(final String firstName, final String lastName, final String userName,
			final String email, final String password, final String contactNumber) {

		return new User(contactNumber, email, firstName, lastName, userName, password);

	}

	public static List<UserDto> getAllTasksUsers(List<User> users) {

		List<UserDto> userDtos = new ArrayList<UserDto>();
		if (users != null && !users.isEmpty()) {
			UserDto userDto = null;
			for (User user : users) {
				userDto = new UserDto();
				userDto.setContactNumber(user.getContactNumber());
				userDto.setEmail(user.getEmail());
				userDto.setFirstName(user.getFirstName());
				userDto.setId(user.getId());
				userDto.setLastName(user.getLastName());
				userDto.setMiddleName(user.getMiddleName());
				userDtos.add(userDto);
			}
		}
		return userDtos;

	}

	public static User getUserFromUserDto(UserDto userDto) {

		User user = new User();
		user.setId(userDto.getId());
		user.setFirstName(userDto.getFirstName());
		user.setMiddleName(userDto.getMiddleName());
		user.setLastName(userDto.getLastName());
		user.setContactNumber(userDto.getContactNumber());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		return user;

	}

	public static UserDto getUserDtoFromUser(User user) {

		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setFirstName(user.getFirstName());
		userDto.setMiddleName(user.getMiddleName());
		userDto.setLastName(user.getLastName());
		userDto.setContactNumber(user.getContactNumber());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		return userDto;

	}

	public static Employee createUser(int employeeId, int statusId, int genderId, int designationId, int roleId,
			String firstName, String middleName, String lastName, String loginName, String loginPassword,
			String employeeDob, String bloodGroup, String addmissionDate, String lastModifiedDate, int emailTypeId,
			int phoneTypeId, int addressTypeId, String emailid, String phoneNumber, String addressLine1,
			String addressLine2, String district, String state, String pinCode, String securityQuestion,
			String securityAnswer) {
		/*
		 * System.out.println("user mapper createUser() starts////////////////"
		 * );
		 * 
		 * SimpleDateFormat simpleDateFormat = new
		 * SimpleDateFormat("dd/MM/yyyy"); Date dateemployeeDob = null; Date
		 * dateaddmissionDate = null; Date datelastModifiedDate = null; try {
		 * dateemployeeDob = simpleDateFormat.parse(employeeDob);
		 * dateaddmissionDate = simpleDateFormat.parse(addmissionDate); //
		 * datelastModifiedDate = simpleDateFormat.parse(lastModifiedDate); }
		 * catch (ParseException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * Employee employee = new Employee(); //
		 * employee.setEmployeeId(employeeId);
		 * 
		 * Status status = new Status(); status.setStatusId(statusId);
		 * employee.setStatus(status);
		 * 
		 * Gender gender = new Gender(); gender.setGenderId(genderId);
		 * employee.setGender(gender);
		 * 
		 * Designation designation = new Designation();
		 * designation.setDesignationId(designationId);
		 * employee.setDesignation(designation);
		 * 
		 * Role role = new Role(); role.setRoleId(roleId);
		 * employee.setRole(role);
		 * 
		 * employee.setFirstName(firstName); employee.setMiddleName(middleName);
		 * employee.setLastName(lastName);
		 * employee.setEmployeeDob(dateemployeeDob);
		 * employee.setBloodGroup(bloodGroup);
		 * employee.setAddmissionDate(dateaddmissionDate);
		 * employee.setLastModifiedDate(dateaddmissionDate);
		 * employee.setEmployeeOfficeId("null");
		 * 
		 * // Set<EmployeeEmail> employeeEmails = new HashSet<EmployeeEmail>(0);
		 * EmployeeEmail employeeEmail = new EmployeeEmail();
		 * employeeEmail.setEmployee(employee);
		 * employeeEmail.setEmployeeEmail(emailid); EmailType emailType = new
		 * EmailType(); emailType.setEmailTypeId(emailTypeId);
		 * employeeEmail.setEmailType(emailType); Set<EmployeeEmail>
		 * employeeEmails = new HashSet<EmployeeEmail>();
		 * employeeEmails.add(employeeEmail);
		 * employee.setEmployeeEmails(employeeEmails);
		 * 
		 * // Set<EmployeePhone> employeePhones = new HashSet<EmployeePhone>(0);
		 * EmployeePhone employeePhone = new EmployeePhone();
		 * employeePhone.setEmployee(employee);
		 * employeePhone.setPhone(phoneNumber); PhoneType phoneType = new
		 * PhoneType(); phoneType.setPhoneTypeId(phoneTypeId);
		 * employeePhone.setPhoneType(phoneType); Set<EmployeePhone>
		 * employeePhones = new HashSet<EmployeePhone>();
		 * employeePhones.add(employeePhone);
		 * employee.setEmployeePhones(employeePhones);
		 * 
		 * // Set<EmployeeLogin> employeeLogins = new HashSet<EmployeeLogin>();
		 * EmployeeLogin employeeLogin = new EmployeeLogin();
		 * employeeLogin.setEmployee(employee);
		 * employeeLogin.setEmployeeLoginName(loginName);
		 * employeeLogin.setEmployeePassword(loginPassword);
		 * employeeLogin.setStatusByStatusId(status);
		 * employeeLogin.setStatusByAuthenticationStatusId(status);
		 * employeeLogin.setEmployeeModificationPassword("mdpwd");
		 * employeeLogin.setLoginAttempts(1);
		 * 
		 * EmployeeLoginSecurity employeeLoginSecurity = new
		 * EmployeeLoginSecurity();
		 * employeeLoginSecurity.setEmployeeLogin(employeeLogin);
		 * employeeLoginSecurity.setSecurityQuestion(securityQuestion);
		 * employeeLoginSecurity.setSecurityAnswer(securityAnswer);
		 * Set<EmployeeLoginSecurity> employeeLoginSecurities = new
		 * HashSet<EmployeeLoginSecurity>();
		 * employeeLoginSecurities.add(employeeLoginSecurity);
		 * employeeLogin.setEmployeeLoginSecurities(employeeLoginSecurities);
		 * 
		 * Set<EmployeeLoginTimedetails> employeeLoginTimedetailses = new
		 * HashSet<EmployeeLoginTimedetails>(); EmployeeLoginTimedetails
		 * employeeLoginTimedetails = new EmployeeLoginTimedetails();
		 * employeeLoginTimedetails.setEmployeeLogin(employeeLogin);
		 * employeeLoginTimedetailses.add(employeeLoginTimedetails);
		 * 
		 * Set<EmployeeLogin> employeeLogins = new HashSet<EmployeeLogin>();
		 * employeeLogins.add(employeeLogin);
		 * employee.setEmployeeLogins(employeeLogins);
		 * 
		 * // Set<EmployeeAddress> employeeAddresses = new //
		 * HashSet<EmployeeAddress>(); EmployeeAddress employeeAddress = new
		 * EmployeeAddress(); employeeAddress.setAddressLine1(addressLine1);
		 * employeeAddress.setAddressLine2(addressLine2); AddressType
		 * addressType = new AddressType();
		 * addressType.setAddressTypeId(addressTypeId);
		 * employeeAddress.setDistrict(district);
		 * 
		 * employeeAddress.setPinCode(pinCode); employeeAddress.setState(state);
		 * 
		 * employeeAddress.setAddressType(addressType); Set<EmployeeAddress>
		 * employeeAddresses = new HashSet<EmployeeAddress>();
		 * employeeAddresses.add(employeeAddress);
		 * addressType.setEmployeeAddresses(employeeAddresses);
		 * employee.setEmployeeAddresses(employeeAddresses);
		 * employeeAddress.setEmployee(employee);
		 * 
		 * System.out.println("//////////////////user mapper createUser() ends"
		 * ); return employee;
		 */
		return null;
	}
}
