package com.shingu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shingu.dao.ApplicationDaoImpl;
import com.shingu.dto.AddressTypeDto;
import com.shingu.dto.DesignationDto;
import com.shingu.dto.EmailTypeDto;
import com.shingu.dto.GenderDto;
import com.shingu.dto.PhoneTypeDto;
import com.shingu.dto.RoleDto;
import com.shingu.dto.StatusDto;

@Service("applicationServiceImpl")
public class ApplicationServiceImpl {

	@Autowired
	ApplicationDaoImpl applicationDaoImpl;

	public ApplicationServiceImpl() {
		super();
		System.out.println("ApplicationServiceImpl");
	}

	@Override
	public String toString() {
		return "ApplicationServiceImpl [applicationDaoImpl="
				+ applicationDaoImpl + "]";
	}

	public ApplicationDaoImpl getApplicationDaoImpl() {
		return applicationDaoImpl;
	}

	public void setApplicationDaoImpl(ApplicationDaoImpl applicationDaoImpl) {
		this.applicationDaoImpl = applicationDaoImpl;
	}

	public List<DesignationDto> getDesignationDtos() {
		return applicationDaoImpl.getDesignationDtos();
	}

	public List<EmailTypeDto> getEmailTypeDtos() {
		return applicationDaoImpl.getEmailTypeDtos();
	}

	public List<GenderDto> getGenderDtos() {
		return applicationDaoImpl.getGenderDtos();
	}

	public List<PhoneTypeDto> getPhoneTypeDtos() {
		return applicationDaoImpl.getPhoneTypeDtos();
	}

	public List<StatusDto> getStatusDtos() {
		return applicationDaoImpl.getStatusDtos();
	}

	public List<RoleDto> getRoleDtos() {
		return applicationDaoImpl.getRoleDtos();
	}

	public List<AddressTypeDto> getAddressTypeDtos() {
		return applicationDaoImpl.getAddressTypeDtos();
	}

}
