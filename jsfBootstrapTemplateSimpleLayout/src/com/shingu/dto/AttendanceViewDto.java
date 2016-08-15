package com.shingu.dto;

import java.util.Date;

public class AttendanceViewDto {

	private String dayDate;
	private Date employeeLoginTime;
	private Date employeeLogoutTime;
	private Date workingHours;

	public String getDayDate() {
		return dayDate;
	}

	public void setDayDate(String dayDate) {
		this.dayDate = dayDate;
	}

	public Date getEmployeeLoginTime() {
		return employeeLoginTime;
	}

	public void setEmployeeLoginTime(Date employeeLoginTime) {
		this.employeeLoginTime = employeeLoginTime;
	}

	public Date getEmployeeLogoutTime() {
		return employeeLogoutTime;
	}

	public void setEmployeeLogoutTime(Date employeeLogoutTime) {
		this.employeeLogoutTime = employeeLogoutTime;
	}

	public Date getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(Date workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public String toString() {
		return "AttendanceViewDto [dayDate=" + dayDate + ", employeeLoginTime="
				+ employeeLoginTime + ", employeeLogoutTime="
				+ employeeLogoutTime + ", workingHours=" + workingHours + "]";
	}

}
