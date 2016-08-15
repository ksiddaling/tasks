package com.shingu.dto;

import java.util.Date;

import com.shingu.model.Employee;

public class EmployeeAttendanceDto {
	private int employeeAttendanceId;
	private Employee employee;
	private Date employeeAttendanceLoginTime;
	private Date employeeAttendanceLogoutTime;
	private Date workingHours;
	private Date day;

	public EmployeeAttendanceDto() {
		super();
		System.out.println("EmployeeAttendanceDto()");
	}

	@Override
	public String toString() {
		return "EmployeeAttendanceDto [employeeAttendanceId="
				+ employeeAttendanceId + ", employee=" + employee
				+ ", employeeAttendanceLoginTime="
				+ employeeAttendanceLoginTime
				+ ", employeeAttendanceLogoutTime="
				+ employeeAttendanceLogoutTime + ", workingHours="
				+ workingHours + ", day=" + day + "]";
	}

	public int getEmployeeAttendanceId() {
		return employeeAttendanceId;
	}

	public void setEmployeeAttendanceId(int employeeAttendanceId) {
		this.employeeAttendanceId = employeeAttendanceId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Date getEmployeeAttendanceLoginTime() {
		return employeeAttendanceLoginTime;
	}

	public void setEmployeeAttendanceLoginTime(Date employeeAttendanceLoginTime) {
		this.employeeAttendanceLoginTime = employeeAttendanceLoginTime;
	}

	public Date getEmployeeAttendanceLogoutTime() {
		return employeeAttendanceLogoutTime;
	}

	public void setEmployeeAttendanceLogoutTime(
			Date employeeAttendanceLogoutTime) {
		this.employeeAttendanceLogoutTime = employeeAttendanceLogoutTime;
	}

	public Date getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(Date workingHours) {
		this.workingHours = workingHours;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

}
