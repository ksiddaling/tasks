package com.shingu.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.shingu.model.Employee;
import com.shingu.model.EmployeeLogin;
import com.shingu.model.Task;

public class StatusDto {

	private int statusId;
	private String statusName;

	public StatusDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public StatusDto(int statusId, String statusName) {
		super();
		this.statusId = statusId;
		this.statusName = statusName;
	}

	@Override
	public String toString() {
		return "StatusDto [statusId=" + statusId + ", statusName=" + statusName + "]";
	}

}
