package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employee_address database table.
 * 
 */
@Entity
@Table(name="employee_address")
@NamedQuery(name="EmployeeAddress.findAll", query="SELECT e FROM EmployeeAddress e")
public class EmployeeAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_address_id")
	private int employeeAddressId;

	@Column(name="address_line1")
	private String addressLine1;

	@Column(name="address_line2")
	private String addressLine2;

	private String district;

	@Column(name="pin_code")
	private String pinCode;

	private String state;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	//bi-directional many-to-one association to AddressType
	@ManyToOne
	@JoinColumn(name="address_type_id")
	private AddressType addressType;

	public EmployeeAddress() {
	}

	public int getEmployeeAddressId() {
		return this.employeeAddressId;
	}

	public void setEmployeeAddressId(int employeeAddressId) {
		this.employeeAddressId = employeeAddressId;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public AddressType getAddressType() {
		return this.addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

}