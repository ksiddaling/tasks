package com.shingu.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shingu.dto.EmployeeLoginTimedetailsDto;
import com.shingu.model.EmployeeAttendance;
import com.shingu.service.AttendanceService;

@ManagedBean(name = "attendanceBean")
@Component
@Scope("request")
public class AttendanceBean implements Serializable {

	private static final long serialVersionUID = -3784137841771652898L;

	@Autowired
	AttendanceService attendanceService;

	public AttendanceService getAttendanceService() {
		return attendanceService;
	}

	public void setAttendanceService(AttendanceService attendanceService) {
		this.attendanceService = attendanceService;
		System.out.println("attendanceService setter" + attendanceService);
	}

	public void attendanceLogin() {
		System.out.println("attendanceLogin controller starts : "
				+ LoginBean.isAttendanceLoggedIn());

		if (LoginBean.isAttendanceLoggedIn() == false) {
			LoginBean
					.setAttendanceLoggedIn(attendanceService.attendanceLogin());
		} else {
			FacesMessage msg = new FacesMessage(
					"already logged in or trying to loggin more then once",
					"ERROR MSG");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		System.out.println("attendanceLogin controller ends : "
				+ LoginBean.isAttendanceLoggedIn());
	}

	public void trial() {
		System.out.println("hello how r u?");
		System.out.println("attendanceLogout controller starts : "
				+ LoginBean.isAttendanceLoggedIn());

		if (LoginBean.isAttendanceLoggedIn() == true) {
			LoginBean.setAttendanceLoggedIn(attendanceService
					.attendanceLogout());
		} else {
			FacesMessage msg = new FacesMessage(
					"first loggIn araa maad le mangyaNanMagney or trying to loggin more then once",
					"ERROR MSG");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		System.out.println("attendanceLogout controller ends : "
				+ LoginBean.isAttendanceLoggedIn());
	}

	public List<EmployeeAttendance> getemployeeLoginTimedetailsDto() {
		System.out.println("employeetimedetails starts");
		return attendanceService.getemployeeLoginTimedetailsDto();
	}
}
