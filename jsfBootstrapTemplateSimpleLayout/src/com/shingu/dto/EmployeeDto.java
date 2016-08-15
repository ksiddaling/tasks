package com.shingu.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.shingu.model.DayWork;
import com.shingu.model.Designation;
import com.shingu.model.EmployeeAddress;
import com.shingu.model.EmployeeAttendance;
import com.shingu.model.EmployeeEmail;
import com.shingu.model.EmployeeLogin;
import com.shingu.model.EmployeePhone;
import com.shingu.model.Gender;
import com.shingu.model.Role;
import com.shingu.model.Status;

public class EmployeeDto {

	private int employeeId;
	private Status status;
	private Gender gender;
	private Designation designation;
	private Role role;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date employeeDob;
	private String bloodGroup;
	private Date addmissionDate;
	private Date lastModifiedDate;
	private String employeeOfficeId;
	private String state;
	private String phone;

	private Set<EmployeeEmail> employeeEmails = new HashSet<EmployeeEmail>(0);
	private Set<EmployeeAttendance> employeeAttendances = new HashSet<EmployeeAttendance>(
			0);
	private Set<EmployeePhone> employeePhones = new HashSet<EmployeePhone>(0);
	private Set<EmployeeLogin> employeeLogins = new HashSet<EmployeeLogin>(0);
	private Set<EmployeeAddress> employeeAddresses = new HashSet<EmployeeAddress>(
			0);
	private Set<DayWork> dayWorks = new HashSet<DayWork>(0);

	public EmployeeDto() {
		super();
		System.out.println("EmployeeDto()");
	}

	@Override
	public String toString() {
		return "EmployeeDto [employeeId=" + employeeId + ", status=" + status
				+ ", gender=" + gender + ", designation=" + designation
				+ ", role=" + role + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName
				+ ", employeeDob=" + employeeDob + ", bloodGroup=" + bloodGroup
				+ ", addmissionDate=" + addmissionDate + ", lastModifiedDate="
				+ lastModifiedDate + ", employeeOfficeId=" + employeeOfficeId
				+ ", employeeEmails=" + employeeEmails
				+ ", employeeAttendances=" + employeeAttendances
				+ ", employeePhones=" + employeePhones + ", employeeLogins="
				+ employeeLogins + ", employeeAddresses=" + employeeAddresses
				+ ", dayWorks=" + dayWorks + "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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

	public Date getEmployeeDob() {
		return employeeDob;
	}

	public void setEmployeeDob(Date employeeDob) {
		this.employeeDob = employeeDob;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Date getAddmissionDate() {
		return addmissionDate;
	}

	public void setAddmissionDate(Date addmissionDate) {
		this.addmissionDate = addmissionDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getEmployeeOfficeId() {
		return employeeOfficeId;
	}

	public void setEmployeeOfficeId(String employeeOfficeId) {
		this.employeeOfficeId = employeeOfficeId;
	}

	public Set<EmployeeEmail> getEmployeeEmails() {
		return employeeEmails;
	}

	public void setEmployeeEmails(Set<EmployeeEmail> employeeEmails) {
		this.employeeEmails = employeeEmails;
	}

	public Set<EmployeeAttendance> getEmployeeAttendances() {
		return employeeAttendances;
	}

	public void setEmployeeAttendances(
			Set<EmployeeAttendance> employeeAttendances) {
		this.employeeAttendances = employeeAttendances;
	}

	public Set<EmployeePhone> getEmployeePhones() {
		return employeePhones;
	}

	public void setEmployeePhones(Set<EmployeePhone> employeePhones) {
		this.employeePhones = employeePhones;
	}

	public Set<EmployeeLogin> getEmployeeLogins() {
		return employeeLogins;
	}

	public void setEmployeeLogins(Set<EmployeeLogin> employeeLogins) {
		this.employeeLogins = employeeLogins;
	}

	public Set<EmployeeAddress> getEmployeeAddresses() {
		return employeeAddresses;
	}

	public void setEmployeeAddresses(Set<EmployeeAddress> employeeAddresses) {
		this.employeeAddresses = employeeAddresses;
	}

	public Set<DayWork> getDayWorks() {
		return dayWorks;
	}

	public void setDayWorks(Set<DayWork> dayWorks) {
		this.dayWorks = dayWorks;
	}

	// constructor using fields

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public EmployeeDto(int employeeId, Status status, Gender gender,
			Designation designation, Role role, String firstName,
			String middleName, String lastName, Date employeeDob,
			String bloodGroup, Date addmissionDate, Date lastModifiedDate,
			String employeeOfficeId, Set<EmployeeEmail> employeeEmails,
			Set<EmployeeAttendance> employeeAttendances,
			Set<EmployeePhone> employeePhones,
			Set<EmployeeLogin> employeeLogins,
			Set<EmployeeAddress> employeeAddresses, Set<DayWork> dayWorks) {
		super();
		this.employeeId = employeeId;
		this.status = status;
		this.gender = gender;
		this.designation = designation;
		this.role = role;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.employeeDob = employeeDob;
		this.bloodGroup = bloodGroup;
		this.addmissionDate = addmissionDate;
		this.lastModifiedDate = lastModifiedDate;
		this.employeeOfficeId = employeeOfficeId;
		this.employeeEmails = employeeEmails;
		this.employeeAttendances = employeeAttendances;
		this.employeePhones = employeePhones;
		this.employeeLogins = employeeLogins;
		this.employeeAddresses = employeeAddresses;
		this.dayWorks = dayWorks;
	}

}
