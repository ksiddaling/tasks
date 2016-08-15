package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employee_phone database table.
 * 
 */
@Entity
@Table(name="employee_phone")
@NamedQuery(name="EmployeePhone.findAll", query="SELECT e FROM EmployeePhone e")
public class EmployeePhone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_phone_id")
	private int employeePhoneId;

	private String phone;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	//bi-directional many-to-one association to PhoneType
	@ManyToOne
	@JoinColumn(name="phone_type_id")
	private PhoneType phoneType;

	public EmployeePhone() {
	}

	public int getEmployeePhoneId() {
		return this.employeePhoneId;
	}

	public void setEmployeePhoneId(int employeePhoneId) {
		this.employeePhoneId = employeePhoneId;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public PhoneType getPhoneType() {
		return this.phoneType;
	}

	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}

}