package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the address_type database table.
 * 
 */
@Entity
@Table(name="address_type")
@NamedQuery(name="AddressType.findAll", query="SELECT a FROM AddressType a")
public class AddressType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_type_id")
	private int addressTypeId;

	@Column(name="address_type")
	private String addressType;

	//bi-directional many-to-one association to EmployeeAddress
	@OneToMany(mappedBy="addressType")
	private List<EmployeeAddress> employeeAddresses;

	public AddressType() {
	}

	public int getAddressTypeId() {
		return this.addressTypeId;
	}

	public void setAddressTypeId(int addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public List<EmployeeAddress> getEmployeeAddresses() {
		return this.employeeAddresses;
	}

	public void setEmployeeAddresses(List<EmployeeAddress> employeeAddresses) {
		this.employeeAddresses = employeeAddresses;
	}

	public EmployeeAddress addEmployeeAddress(EmployeeAddress employeeAddress) {
		getEmployeeAddresses().add(employeeAddress);
		employeeAddress.setAddressType(this);

		return employeeAddress;
	}

	public EmployeeAddress removeEmployeeAddress(EmployeeAddress employeeAddress) {
		getEmployeeAddresses().remove(employeeAddress);
		employeeAddress.setAddressType(null);

		return employeeAddress;
	}

}