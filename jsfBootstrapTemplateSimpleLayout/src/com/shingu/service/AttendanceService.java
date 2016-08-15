package com.shingu.service;

import java.util.List;

import com.shingu.dto.EmployeeLoginTimedetailsDto;
import com.shingu.model.EmployeeAttendance;

public interface AttendanceService {
	
	public boolean attendanceLogin();
	public boolean attendanceLogout();
	public List<EmployeeAttendance> getemployeeLoginTimedetailsDto();

}
