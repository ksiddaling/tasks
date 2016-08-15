package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employee_email database table.
 * 
 */
@Entity
@Table(name="employee_email")
@NamedQuery(name="EmployeeEmail.findAll", query="SELECT e FROM EmployeeEmail e")
public class EmployeeEmail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_email_id")
	private int employeeEmailId;

	@Column(name="employee_email")
	private String employeeEmail;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	//bi-directional many-to-one association to EmailType
	@ManyToOne
	@JoinColumn(name="email_type_id")
	private EmailType emailType;

	public EmployeeEmail() {
	}

	public int getEmployeeEmailId() {
		return this.employeeEmailId;
	}

	public void setEmployeeEmailId(int employeeEmailId) {
		this.employeeEmailId = employeeEmailId;
	}

	public String getEmployeeEmail() {
		return this.employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmailType getEmailType() {
		return this.emailType;
	}

	public void setEmailType(EmailType emailType) {
		this.emailType = emailType;
	}

}