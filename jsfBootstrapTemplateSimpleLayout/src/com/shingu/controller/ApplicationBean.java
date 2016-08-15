package com.shingu.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shingu.dto.AddressTypeDto;
import com.shingu.dto.DesignationDto;
import com.shingu.dto.EmailTypeDto;
import com.shingu.dto.GenderDto;
import com.shingu.dto.PhoneTypeDto;
import com.shingu.dto.RoleDto;
import com.shingu.dto.StatusDto;
import com.shingu.service.ApplicationServiceImpl;

@ManagedBean(name = "applicationBean")
@ApplicationScoped
@Controller
public class ApplicationBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<DesignationDto> designationDtos;
	private List<EmailTypeDto> emailTypeDtos;
	private List<GenderDto> genderDtos;
	private List<PhoneTypeDto> phoneTypeDtos;
	private List<StatusDto> statusDtos;
	private List<RoleDto> roleDtos;
	private List<AddressTypeDto> addressTypeDtos;

	@Autowired
	ApplicationServiceImpl applicationServiceImpl;

	public ApplicationServiceImpl getApplicationServiceImpl() {
		return applicationServiceImpl;
	}

	public void setApplicationServiceImpl(ApplicationServiceImpl applicationServiceImpl) {
		this.applicationServiceImpl = applicationServiceImpl;
	}

	public ApplicationBean() {
		super();
		System.out.println("ApplicationBean()");
	}

	public List<DesignationDto> getDesignationDtos() {
		designationDtos = applicationServiceImpl.getDesignationDtos();
		for (DesignationDto d : designationDtos) {
			System.out.println(d.getDesignationName());
		}
		return designationDtos;
	}

	public void setDesignationDtos(List<DesignationDto> designationDtos) {
		this.designationDtos = designationDtos;
	}

	public List<EmailTypeDto> getEmailTypeDtos() {
		emailTypeDtos = applicationServiceImpl.getEmailTypeDtos();
		return emailTypeDtos;
	}

	public void setEmailTypeDtos(List<EmailTypeDto> emailTypeDtos) {
		this.emailTypeDtos = emailTypeDtos;
	}

	public List<GenderDto> getGenderDtos() {
		genderDtos = applicationServiceImpl.getGenderDtos();
		return genderDtos;
	}

	public void setGenderDtos(List<GenderDto> genderDtos) {
		this.genderDtos = genderDtos;
	}

	public List<PhoneTypeDto> getPhoneTypeDtos() {
		phoneTypeDtos = applicationServiceImpl.getPhoneTypeDtos();
		return phoneTypeDtos;
	}

	public void setPhoneTypeDtos(List<PhoneTypeDto> phoneTypeDtos) {
		this.phoneTypeDtos = phoneTypeDtos;
	}

	public List<StatusDto> getStatusDtos() {
		statusDtos = applicationServiceImpl.getStatusDtos();
		return statusDtos;
	}

	public void setStatusDtos(List<StatusDto> statusDtos) {
		this.statusDtos = statusDtos;
	}

	public List<RoleDto> getRoleDtos() {
		roleDtos = applicationServiceImpl.getRoleDtos();
		return roleDtos;
	}

	public void setRoleDtos(List<RoleDto> roleDtos) {
		this.roleDtos = roleDtos;
	}

	public List<AddressTypeDto> getAddressTypeDtos() {
		addressTypeDtos = applicationServiceImpl.getAddressTypeDtos();
		return addressTypeDtos;
	}

	public void setAddressTypeDtos(List<AddressTypeDto> addressTypeDtos) {
		this.addressTypeDtos = addressTypeDtos;
	}

	public static String getUserIDFromSession() {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
		HttpSession httpSession = request.getSession(false);
		String userid = (String) httpSession.getAttribute("userid");
		return userid;
	}
}
