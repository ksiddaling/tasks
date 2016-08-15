package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the phone_type database table.
 * 
 */
@Entity
@Table(name="phone_type")
@NamedQuery(name="PhoneType.findAll", query="SELECT p FROM PhoneType p")
public class PhoneType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="phone_type_id")
	private int phoneTypeId;

	@Column(name="phone_type_name")
	private String phoneTypeName;

	//bi-directional many-to-one association to EmployeePhone
	@OneToMany(mappedBy="phoneType")
	private List<EmployeePhone> employeePhones;

	public PhoneType() {
	}

	public int getPhoneTypeId() {
		return this.phoneTypeId;
	}

	public void setPhoneTypeId(int phoneTypeId) {
		this.phoneTypeId = phoneTypeId;
	}

	public String getPhoneTypeName() {
		return this.phoneTypeName;
	}

	public void setPhoneTypeName(String phoneTypeName) {
		this.phoneTypeName = phoneTypeName;
	}

	public List<EmployeePhone> getEmployeePhones() {
		return this.employeePhones;
	}

	public void setEmployeePhones(List<EmployeePhone> employeePhones) {
		this.employeePhones = employeePhones;
	}

	public EmployeePhone addEmployeePhone(EmployeePhone employeePhone) {
		getEmployeePhones().add(employeePhone);
		employeePhone.setPhoneType(this);

		return employeePhone;
	}

	public EmployeePhone removeEmployeePhone(EmployeePhone employeePhone) {
		getEmployeePhones().remove(employeePhone);
		employeePhone.setPhoneType(null);

		return employeePhone;
	}

}