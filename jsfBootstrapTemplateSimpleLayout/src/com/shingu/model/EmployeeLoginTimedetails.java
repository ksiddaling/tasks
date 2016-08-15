package com.shingu.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EmployeeLoginTimedetails generated by hbm2java
 */
@Entity
@Table(name = "employee_login_timedetails", catalog = "attendance")
public class EmployeeLoginTimedetails implements java.io.Serializable {

	private int employeeLoginTimeId;
	private EmployeeLogin employeeLogin;
	private Date employeeLoginTime;
	private Date employeeLogoutTime;
	private String employeeLoginIp;

	public EmployeeLoginTimedetails() {
	}

	public EmployeeLoginTimedetails(int employeeLoginTimeId,
			EmployeeLogin employeeLogin, Date employeeLoginTime,
			Date employeeLogoutTime) {
		this.employeeLoginTimeId = employeeLoginTimeId;
		this.employeeLogin = employeeLogin;
		this.employeeLoginTime = employeeLoginTime;
		this.employeeLogoutTime = employeeLogoutTime;
	}

	public EmployeeLoginTimedetails(int employeeLoginTimeId,
			EmployeeLogin employeeLogin, Date employeeLoginTime,
			Date employeeLogoutTime, String employeeLoginIp) {
		this.employeeLoginTimeId = employeeLoginTimeId;
		this.employeeLogin = employeeLogin;
		this.employeeLoginTime = employeeLoginTime;
		this.employeeLogoutTime = employeeLogoutTime;
		this.employeeLoginIp = employeeLoginIp;
	}

	@Id
	@Column(name = "employee_login_time_id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getEmployeeLoginTimeId() {
		return this.employeeLoginTimeId;
	}

	public void setEmployeeLoginTimeId(int employeeLoginTimeId) {
		this.employeeLoginTimeId = employeeLoginTimeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_login_id", nullable = false)
	public EmployeeLogin getEmployeeLogin() {
		return this.employeeLogin;
	}

	public void setEmployeeLogin(EmployeeLogin employeeLogin) {
		this.employeeLogin = employeeLogin;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "employee_login_time", nullable = true, length = 19)
	public Date getEmployeeLoginTime() {
		return this.employeeLoginTime;
	}

	public void setEmployeeLoginTime(Date employeeLoginTime) {
		this.employeeLoginTime = employeeLoginTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "employee_logout_time", nullable = true, length = 19)
	public Date getEmployeeLogoutTime() {
		return this.employeeLogoutTime;
	}

	public void setEmployeeLogoutTime(Date employeeLogoutTime) {
		this.employeeLogoutTime = employeeLogoutTime;
	}

	@Column(name = "employee_login_ip", length = 20)
	public String getEmployeeLoginIp() {
		return this.employeeLoginIp;
	}

	public void setEmployeeLoginIp(String employeeLoginIp) {
		this.employeeLoginIp = employeeLoginIp;
	}

}
