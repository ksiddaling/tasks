package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employee_login_security database table.
 * 
 */
@Entity
@Table(name="employee_login_security")
@NamedQuery(name="EmployeeLoginSecurity.findAll", query="SELECT e FROM EmployeeLoginSecurity e")
public class EmployeeLoginSecurity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_login_security_id")
	private int employeeLoginSecurityId;

	@Column(name="security_answer")
	private String securityAnswer;

	@Column(name="security_question")
	private String securityQuestion;

	//bi-directional many-to-one association to EmployeeLogin
	@ManyToOne
	@JoinColumn(name="employee_login_id")
	private EmployeeLogin employeeLogin;

	public EmployeeLoginSecurity() {
	}

	public int getEmployeeLoginSecurityId() {
		return this.employeeLoginSecurityId;
	}

	public void setEmployeeLoginSecurityId(int employeeLoginSecurityId) {
		this.employeeLoginSecurityId = employeeLoginSecurityId;
	}

	public String getSecurityAnswer() {
		return this.securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public String getSecurityQuestion() {
		return this.securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public EmployeeLogin getEmployeeLogin() {
		return this.employeeLogin;
	}

	public void setEmployeeLogin(EmployeeLogin employeeLogin) {
		this.employeeLogin = employeeLogin;
	}

}