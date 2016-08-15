package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the email_type database table.
 * 
 */
@Entity
@Table(name="email_type")
@NamedQuery(name="EmailType.findAll", query="SELECT e FROM EmailType e")
public class EmailType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="email_type_id")
	private int emailTypeId;

	@Column(name="email_type_name")
	private String emailTypeName;

	//bi-directional many-to-one association to EmployeeEmail
	@OneToMany(mappedBy="emailType")
	private List<EmployeeEmail> employeeEmails;

	public EmailType() {
	}

	public int getEmailTypeId() {
		return this.emailTypeId;
	}

	public void setEmailTypeId(int emailTypeId) {
		this.emailTypeId = emailTypeId;
	}

	public String getEmailTypeName() {
		return this.emailTypeName;
	}

	public void setEmailTypeName(String emailTypeName) {
		this.emailTypeName = emailTypeName;
	}

	public List<EmployeeEmail> getEmployeeEmails() {
		return this.employeeEmails;
	}

	public void setEmployeeEmails(List<EmployeeEmail> employeeEmails) {
		this.employeeEmails = employeeEmails;
	}

	public EmployeeEmail addEmployeeEmail(EmployeeEmail employeeEmail) {
		getEmployeeEmails().add(employeeEmail);
		employeeEmail.setEmailType(this);

		return employeeEmail;
	}

	public EmployeeEmail removeEmployeeEmail(EmployeeEmail employeeEmail) {
		getEmployeeEmails().remove(employeeEmail);
		employeeEmail.setEmailType(null);

		return employeeEmail;
	}

}