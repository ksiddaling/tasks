package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the employee_attendance database table.
 * 
 */
@Entity
@Table(name="employee_attendance")
@NamedQuery(name="EmployeeAttendance.findAll", query="SELECT e FROM EmployeeAttendance e")
public class EmployeeAttendance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_attendance_id")
	private int employeeAttendanceId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="employee_attendance_login_time")
	private Date employeeAttendanceLoginTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="employee_attendance_logout_time")
	private Date employeeAttendanceLogoutTime;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	public EmployeeAttendance() {
	}

	public int getEmployeeAttendanceId() {
		return this.employeeAttendanceId;
	}

	public void setEmployeeAttendanceId(int employeeAttendanceId) {
		this.employeeAttendanceId = employeeAttendanceId;
	}

	public Date getEmployeeAttendanceLoginTime() {
		return this.employeeAttendanceLoginTime;
	}

	public void setEmployeeAttendanceLoginTime(Date employeeAttendanceLoginTime) {
		this.employeeAttendanceLoginTime = employeeAttendanceLoginTime;
	}

	public Date getEmployeeAttendanceLogoutTime() {
		return this.employeeAttendanceLogoutTime;
	}

	public void setEmployeeAttendanceLogoutTime(Date employeeAttendanceLogoutTime) {
		this.employeeAttendanceLogoutTime = employeeAttendanceLogoutTime;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}