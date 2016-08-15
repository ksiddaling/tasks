package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the gender database table.
 * 
 */
@Entity
@NamedQuery(name="Gender.findAll", query="SELECT g FROM Gender g")
public class Gender implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gender_id")
	private int genderId;

	@Column(name="gender_type")
	private String genderType;

	//bi-directional many-to-one association to Employee
	@OneToMany(mappedBy="gender")
	private List<Employee> employees;

	public Gender() {
	}

	public int getGenderId() {
		return this.genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}

	public String getGenderType() {
		return this.genderType;
	}

	public void setGenderType(String genderType) {
		this.genderType = genderType;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setGender(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setGender(null);

		return employee;
	}

}