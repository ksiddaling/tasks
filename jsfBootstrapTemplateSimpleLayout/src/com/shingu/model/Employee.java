package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int employeeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="addmission_date")
	private Date addmissionDate;

	@Column(name="blood_group")
	private String bloodGroup;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="employee_dob")
	private Date employeeDob;

	@Column(name="employee_office_id")
	private String employeeOfficeId;

	@Column(name="first_name")
	private String firstName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_modified_date")
	private Date lastModifiedDate;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	//bi-directional many-to-one association to DayWork
	@OneToMany(mappedBy="employee")
	private List<DayWork> dayWorks;

	//bi-directional many-to-one association to Designation
	@ManyToOne
	@JoinColumn(name="designation_id")
	private Designation designation;

	//bi-directional many-to-one association to Gender
	@ManyToOne
	@JoinColumn(name="employee_gender_id")
	private Gender gender;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="employee_status_id")
	private Status status;

	//bi-directional many-to-one association to EmployeeAddress
	@OneToMany(mappedBy="employee")
	private List<EmployeeAddress> employeeAddresses;

	//bi-directional many-to-one association to EmployeeAttendance
	@OneToMany(mappedBy="employee")
	private List<EmployeeAttendance> employeeAttendances;

	//bi-directional many-to-one association to EmployeeEmail
	@OneToMany(mappedBy="employee")
	private List<EmployeeEmail> employeeEmails;

	//bi-directional many-to-one association to EmployeeLogin
	@OneToMany(mappedBy="employee")
	private List<EmployeeLogin> employeeLogins;

	//bi-directional many-to-one association to EmployeePhone
	@OneToMany(mappedBy="employee")
	private List<EmployeePhone> employeePhones;

	public Employee() {
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getAddmissionDate() {
		return this.addmissionDate;
	}

	public void setAddmissionDate(Date addmissionDate) {
		this.addmissionDate = addmissionDate;
	}

	public String getBloodGroup() {
		return this.bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Date getEmployeeDob() {
		return this.employeeDob;
	}

	public void setEmployeeDob(Date employeeDob) {
		this.employeeDob = employeeDob;
	}

	public String getEmployeeOfficeId() {
		return this.employeeOfficeId;
	}

	public void setEmployeeOfficeId(String employeeOfficeId) {
		this.employeeOfficeId = employeeOfficeId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public List<DayWork> getDayWorks() {
		return this.dayWorks;
	}

	public void setDayWorks(List<DayWork> dayWorks) {
		this.dayWorks = dayWorks;
	}

	public DayWork addDayWork(DayWork dayWork) {
		getDayWorks().add(dayWork);
		dayWork.setEmployee(this);

		return dayWork;
	}

	public DayWork removeDayWork(DayWork dayWork) {
		getDayWorks().remove(dayWork);
		dayWork.setEmployee(null);

		return dayWork;
	}

	public Designation getDesignation() {
		return this.designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public Gender getGender() {
		return this.gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<EmployeeAddress> getEmployeeAddresses() {
		return this.employeeAddresses;
	}

	public void setEmployeeAddresses(List<EmployeeAddress> employeeAddresses) {
		this.employeeAddresses = employeeAddresses;
	}

	public EmployeeAddress addEmployeeAddress(EmployeeAddress employeeAddress) {
		getEmployeeAddresses().add(employeeAddress);
		employeeAddress.setEmployee(this);

		return employeeAddress;
	}

	public EmployeeAddress removeEmployeeAddress(EmployeeAddress employeeAddress) {
		getEmployeeAddresses().remove(employeeAddress);
		employeeAddress.setEmployee(null);

		return employeeAddress;
	}

	public List<EmployeeAttendance> getEmployeeAttendances() {
		return this.employeeAttendances;
	}

	public void setEmployeeAttendances(List<EmployeeAttendance> employeeAttendances) {
		this.employeeAttendances = employeeAttendances;
	}

	public EmployeeAttendance addEmployeeAttendance(EmployeeAttendance employeeAttendance) {
		getEmployeeAttendances().add(employeeAttendance);
		employeeAttendance.setEmployee(this);

		return employeeAttendance;
	}

	public EmployeeAttendance removeEmployeeAttendance(EmployeeAttendance employeeAttendance) {
		getEmployeeAttendances().remove(employeeAttendance);
		employeeAttendance.setEmployee(null);

		return employeeAttendance;
	}

	public List<EmployeeEmail> getEmployeeEmails() {
		return this.employeeEmails;
	}

	public void setEmployeeEmails(List<EmployeeEmail> employeeEmails) {
		this.employeeEmails = employeeEmails;
	}

	public EmployeeEmail addEmployeeEmail(EmployeeEmail employeeEmail) {
		getEmployeeEmails().add(employeeEmail);
		employeeEmail.setEmployee(this);

		return employeeEmail;
	}

	public EmployeeEmail removeEmployeeEmail(EmployeeEmail employeeEmail) {
		getEmployeeEmails().remove(employeeEmail);
		employeeEmail.setEmployee(null);

		return employeeEmail;
	}

	public List<EmployeeLogin> getEmployeeLogins() {
		return this.employeeLogins;
	}

	public void setEmployeeLogins(List<EmployeeLogin> employeeLogins) {
		this.employeeLogins = employeeLogins;
	}

	public EmployeeLogin addEmployeeLogin(EmployeeLogin employeeLogin) {
		getEmployeeLogins().add(employeeLogin);
		employeeLogin.setEmployee(this);

		return employeeLogin;
	}

	public EmployeeLogin removeEmployeeLogin(EmployeeLogin employeeLogin) {
		getEmployeeLogins().remove(employeeLogin);
		employeeLogin.setEmployee(null);

		return employeeLogin;
	}

	public List<EmployeePhone> getEmployeePhones() {
		return this.employeePhones;
	}

	public void setEmployeePhones(List<EmployeePhone> employeePhones) {
		this.employeePhones = employeePhones;
	}

	public EmployeePhone addEmployeePhone(EmployeePhone employeePhone) {
		getEmployeePhones().add(employeePhone);
		employeePhone.setEmployee(this);

		return employeePhone;
	}

	public EmployeePhone removeEmployeePhone(EmployeePhone employeePhone) {
		getEmployeePhones().remove(employeePhone);
		employeePhone.setEmployee(null);

		return employeePhone;
	}

}