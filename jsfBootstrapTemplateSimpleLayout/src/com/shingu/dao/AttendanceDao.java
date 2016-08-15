package com.shingu.dao;

import java.util.List;

import com.shingu.model.EmployeeAttendance;

public interface AttendanceDao {
	public boolean attendanceLogin(String userid);

	public boolean attendanceLogout(String userid);

	public List<EmployeeAttendance> attendanceList();
}
