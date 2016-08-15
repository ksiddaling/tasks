package com.shingu.dao;

import java.util.ArrayList; 
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.shingu.dto.AddressTypeDto;
import com.shingu.dto.DesignationDto;
import com.shingu.dto.EmailTypeDto;
import com.shingu.dto.GenderDto;
import com.shingu.dto.PhoneTypeDto;
import com.shingu.dto.RoleDto;
import com.shingu.dto.StatusDto;
import com.shingu.model.AddressType;
import com.shingu.model.Designation;
import com.shingu.model.EmailType;
import com.shingu.model.Gender;
import com.shingu.model.PhoneType;
import com.shingu.model.Role;
import com.shingu.model.Status;
import com.shingu.util.MyHibernateDaoSupport;

@Repository("applicationDaoImpl")
public class ApplicationDaoImpl extends MyHibernateDaoSupport {

	public List<DesignationDto> getDesignationDtos() {
		Session session = null;
		List<DesignationDto> designationDtos = new ArrayList<DesignationDto>();
		DesignationDto designationDto = null;
		try {
			session = getSession();
			Query query = session.createQuery("from Designation");
			List<Designation> designations = query.list();
			System.out.println(designations.size());
			for (Designation u : designations) {
				System.out.println(u.getDesignationId() + " , "
						+ u.getDesignationName());
				designationDto = new DesignationDto();
				designationDto.setDesignationId(u.getDesignationId());
				designationDto.setDesignationName(u.getDesignationName());
				designationDtos.add(designationDto);
			}
		} finally {
			releaseSession(session);
			designationDto = null;
		}
		return designationDtos;
	}

	public List<EmailTypeDto> getEmailTypeDtos() {
		List<EmailTypeDto> emailTypeDtos = new ArrayList<EmailTypeDto>();
		Session session = null;
		EmailTypeDto emailTypeDto = null;
		try {
			session = getSession();
			Query query = session.createQuery("from EmailType");
			List<EmailType> emailTypes = query.list();
			System.out.println(emailTypes.size());
			for (EmailType u : emailTypes) {
				System.out.println(u.getEmailTypeId() + " , "
						+ u.getEmailTypeName());
				emailTypeDto = new EmailTypeDto();
				emailTypeDto.setEmailTypeId(u.getEmailTypeId());
				emailTypeDto.setEmailTypeName(u.getEmailTypeName());
				emailTypeDtos.add(emailTypeDto);
			}
		} finally {
			releaseSession(session);
			emailTypeDto = null;
		}
		return emailTypeDtos;
	}

	public List<GenderDto> getGenderDtos() {
		List<GenderDto> genderDtos = new ArrayList<GenderDto>();
		Session session = null;
		GenderDto genderDto = null;
		try {
			session = getSession();
			Query query = session.createQuery("from Gender");
			List<Gender> genders = query.list();
			System.out.println(genders.size());
			for (Gender u : genders) {
				System.out.println(u.getGenderId() + " , " + u.getGenderType());
				genderDto = new GenderDto();
				genderDto.setGenderId(u.getGenderId());
				genderDto.setGenderType(u.getGenderType());
				genderDtos.add(genderDto);
			}
		} finally {
			releaseSession(session);
			genderDto = null;
		}
		return genderDtos;
	}

	public List<PhoneTypeDto> getPhoneTypeDtos() {
		List<PhoneTypeDto> phoneTypeDtos = new ArrayList<PhoneTypeDto>();
		Session session = null;
		PhoneTypeDto phoneTypeDto = null;
		try {
			session = getSession();
			Query query = session.createQuery("from PhoneType");
			List<PhoneType> phoneTypes = query.list();
			System.out.println(phoneTypes.size());
			for (PhoneType u : phoneTypes) {
				System.out.println(u.getPhoneTypeId() + " , "
						+ u.getPhoneTypeName());
				phoneTypeDto = new PhoneTypeDto();
				phoneTypeDto.setPhoneTypeId(u.getPhoneTypeId());
				phoneTypeDto.setPhoneTypeName(u.getPhoneTypeName());
				phoneTypeDtos.add(phoneTypeDto);
			}
		} finally {
			releaseSession(session);
			phoneTypeDto = null;
		}
		return phoneTypeDtos;
	}

	public List<StatusDto> getStatusDtos() {
		List<StatusDto> statusDtos = new ArrayList<StatusDto>();
		Session session = null;
		StatusDto statusDto = null;
		try {
			session = getSession();
			Query query = session.createQuery("from Status");
			List<Status> status = query.list();
			System.out.println(status.size());
			for (Status u : status) {
				System.out.println(u.getStatusId() + " , " + u.getStatusName());
				statusDto = new StatusDto();
				statusDto.setStatusId(u.getStatusId());
				statusDto.setStatusName(u.getStatusName());
				statusDtos.add(statusDto);
			}
		} finally {
			releaseSession(session);
			statusDto = null;
		}
		return statusDtos;
	}

	public List<RoleDto> getRoleDtos() {
		List<RoleDto> roleDtos = new ArrayList<RoleDto>();
		Session session = null;
		RoleDto roleDto = null;
		try {
			session = getSession();
			Query query = session.createQuery("from Role");
			List<Role> roles = query.list();
			System.out.println(roles.size());
			for (Role u : roles) {
				System.out.println(u.getRoleId() + " , " + u.getRoleName());
				roleDto = new RoleDto();
				roleDto.setRoleId(u.getRoleId());
				roleDto.setRoleName(u.getRoleName());
				roleDtos.add(roleDto);
			}
		} finally {
			releaseSession(session);
			roleDto = null;
		}

		return roleDtos;
	}

	public List<AddressTypeDto> getAddressTypeDtos() {
		List<AddressTypeDto> addressTypeDtos = new ArrayList<AddressTypeDto>();
		Session session = null;
		AddressTypeDto addressTypeDto = null;
		try {
			session = getSession();
			Query query = session.createQuery("from AddressType");
			List<AddressType> addressTypes = query.list();
			System.out.println(addressTypes.size());
			for (AddressType u : addressTypes) {
				System.out.println(u.getAddressTypeId() + " , "
						+ u.getAddressType());
				addressTypeDto = new AddressTypeDto();
				addressTypeDto.setAddressTypeId(u.getAddressTypeId());
				addressTypeDto.setAddressType(u.getAddressType());
				addressTypeDtos.add(addressTypeDto);
			}
		} finally {
			releaseSession(session);
			addressTypeDto = null;
		}
		return addressTypeDtos;
	}
}
