package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the employee_login_timedetails database table.
 * 
 */
@Entity
@Table(name="employee_login_timedetails")
@NamedQuery(name="EmployeeLoginTimedetail.findAll", query="SELECT e FROM EmployeeLoginTimedetail e")
public class EmployeeLoginTimedetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_login_time_id")
	private int employeeLoginTimeId;

	@Column(name="employee_login_ip")
	private String employeeLoginIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="employee_login_time")
	private Date employeeLoginTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="employee_logout_time")
	private Date employeeLogoutTime;

	//bi-directional many-to-one association to EmployeeLogin
	@ManyToOne
	@JoinColumn(name="employee_login_id")
	private EmployeeLogin employeeLogin;

	public EmployeeLoginTimedetail() {
	}

	public int getEmployeeLoginTimeId() {
		return this.employeeLoginTimeId;
	}

	public void setEmployeeLoginTimeId(int employeeLoginTimeId) {
		this.employeeLoginTimeId = employeeLoginTimeId;
	}

	public String getEmployeeLoginIp() {
		return this.employeeLoginIp;
	}

	public void setEmployeeLoginIp(String employeeLoginIp) {
		this.employeeLoginIp = employeeLoginIp;
	}

	public Date getEmployeeLoginTime() {
		return this.employeeLoginTime;
	}

	public void setEmployeeLoginTime(Date employeeLoginTime) {
		this.employeeLoginTime = employeeLoginTime;
	}

	public Date getEmployeeLogoutTime() {
		return this.employeeLogoutTime;
	}

	public void setEmployeeLogoutTime(Date employeeLogoutTime) {
		this.employeeLogoutTime = employeeLogoutTime;
	}

	public EmployeeLogin getEmployeeLogin() {
		return this.employeeLogin;
	}

	public void setEmployeeLogin(EmployeeLogin employeeLogin) {
		this.employeeLogin = employeeLogin;
	}

}