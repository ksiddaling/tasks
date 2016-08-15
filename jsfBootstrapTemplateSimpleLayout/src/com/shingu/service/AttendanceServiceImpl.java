package com.shingu.service;

import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shingu.controller.ApplicationBean;
import com.shingu.dao.AttendanceDao;
import com.shingu.dto.EmployeeLoginTimedetailsDto;
import com.shingu.model.EmployeeAttendance;

@Service("attendanceServiceImpl")
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	AttendanceDao attendanceDao;

	public AttendanceDao getAttendanceDao() {
		return attendanceDao;
	}

	public void setAttendanceDao(AttendanceDao attendanceDao) {
		this.attendanceDao = attendanceDao;
	}

	@Override
	public boolean attendanceLogin() {
		System.out.println(" attendanceLogin() service starts");

		boolean result = attendanceDao.attendanceLogin(ApplicationBean
				.getUserIDFromSession());

		System.out.println(" attendanceLogin() service ends :" + result);
		return result;
	}

	@Override
	public boolean attendanceLogout() {
		System.out.println(" attendanceLogout() service starts");

		boolean result = attendanceDao.attendanceLogout(ApplicationBean
				.getUserIDFromSession());

		System.out.println(" attendanceLogout() service ends :" + result);
		return result;
	}

	@Override
	public List<EmployeeAttendance> getemployeeLoginTimedetailsDto() {
		
		return attendanceDao.attendanceList();
	}

}
