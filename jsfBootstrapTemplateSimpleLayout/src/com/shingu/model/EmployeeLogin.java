package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the employee_login database table.
 * 
 */
@Entity
@Table(name="employee_login")
@NamedQuery(name="EmployeeLogin.findAll", query="SELECT e FROM EmployeeLogin e")
public class EmployeeLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_login_id")
	private int employeeLoginId;

	@Column(name="employee_login_name")
	private String employeeLoginName;

	@Column(name="employee_modification_password")
	private String employeeModificationPassword;

	@Column(name="employee_password")
	private String employeePassword;

	@Column(name="login_attempts")
	private int loginAttempts;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="authentication_status_id")
	private Status status1;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	//bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name="status_id")
	private Status status2;

	//bi-directional many-to-one association to EmployeeLoginSecurity
	@OneToMany(mappedBy="employeeLogin")
	private List<EmployeeLoginSecurity> employeeLoginSecurities;

	//bi-directional many-to-one association to EmployeeLoginTimedetail
	@OneToMany(mappedBy="employeeLogin")
	private List<EmployeeLoginTimedetail> employeeLoginTimedetails;

	public EmployeeLogin() {
	}

	public int getEmployeeLoginId() {
		return this.employeeLoginId;
	}

	public void setEmployeeLoginId(int employeeLoginId) {
		this.employeeLoginId = employeeLoginId;
	}

	public String getEmployeeLoginName() {
		return this.employeeLoginName;
	}

	public void setEmployeeLoginName(String employeeLoginName) {
		this.employeeLoginName = employeeLoginName;
	}

	public String getEmployeeModificationPassword() {
		return this.employeeModificationPassword;
	}

	public void setEmployeeModificationPassword(String employeeModificationPassword) {
		this.employeeModificationPassword = employeeModificationPassword;
	}

	public String getEmployeePassword() {
		return this.employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	public int getLoginAttempts() {
		return this.loginAttempts;
	}

	public void setLoginAttempts(int loginAttempts) {
		this.loginAttempts = loginAttempts;
	}

	public Status getStatus1() {
		return this.status1;
	}

	public void setStatus1(Status status1) {
		this.status1 = status1;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Status getStatus2() {
		return this.status2;
	}

	public void setStatus2(Status status2) {
		this.status2 = status2;
	}

	public List<EmployeeLoginSecurity> getEmployeeLoginSecurities() {
		return this.employeeLoginSecurities;
	}

	public void setEmployeeLoginSecurities(List<EmployeeLoginSecurity> employeeLoginSecurities) {
		this.employeeLoginSecurities = employeeLoginSecurities;
	}

	public EmployeeLoginSecurity addEmployeeLoginSecurity(EmployeeLoginSecurity employeeLoginSecurity) {
		getEmployeeLoginSecurities().add(employeeLoginSecurity);
		employeeLoginSecurity.setEmployeeLogin(this);

		return employeeLoginSecurity;
	}

	public EmployeeLoginSecurity removeEmployeeLoginSecurity(EmployeeLoginSecurity employeeLoginSecurity) {
		getEmployeeLoginSecurities().remove(employeeLoginSecurity);
		employeeLoginSecurity.setEmployeeLogin(null);

		return employeeLoginSecurity;
	}

	public List<EmployeeLoginTimedetail> getEmployeeLoginTimedetails() {
		return this.employeeLoginTimedetails;
	}

	public void setEmployeeLoginTimedetails(List<EmployeeLoginTimedetail> employeeLoginTimedetails) {
		this.employeeLoginTimedetails = employeeLoginTimedetails;
	}

	public EmployeeLoginTimedetail addEmployeeLoginTimedetail(EmployeeLoginTimedetail employeeLoginTimedetail) {
		getEmployeeLoginTimedetails().add(employeeLoginTimedetail);
		employeeLoginTimedetail.setEmployeeLogin(this);

		return employeeLoginTimedetail;
	}

	public EmployeeLoginTimedetail removeEmployeeLoginTimedetail(EmployeeLoginTimedetail employeeLoginTimedetail) {
		getEmployeeLoginTimedetails().remove(employeeLoginTimedetail);
		employeeLoginTimedetail.setEmployeeLogin(null);

		return employeeLoginTimedetail;
	}

}