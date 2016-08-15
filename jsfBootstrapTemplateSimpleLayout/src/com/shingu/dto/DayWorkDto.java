package com.shingu.dto;

import com.shingu.model.Employee;

public class DayWorkDto {

	private int dayWorkId;
	private Employee employee;
	private String dayWork;

	public DayWorkDto() {
		super();
		System.out.println("DayWork()");
	}

	public DayWorkDto(Employee employee, String dayWork) {
		super();
		this.employee = employee;
		this.dayWork = dayWork;
		System.out.println("DayWorkDto(Employee employee, String dayWork)");
	}

	@Override
	public String toString() {
		return "DayWork [dayWorkId=" + dayWorkId + ", employee=" + employee
				+ ", dayWork=" + dayWork + "]";
	}

	public int getDayWorkId() {
		return dayWorkId;
	}

	public void setDayWorkId(int dayWorkId) {
		this.dayWorkId = dayWorkId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getDayWork() {
		return dayWork;
	}

	public void setDayWork(String dayWork) {
		this.dayWork = dayWork;
	}

}
