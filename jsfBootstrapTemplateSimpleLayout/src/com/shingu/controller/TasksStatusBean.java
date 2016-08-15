package com.shingu.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shingu.dto.StatusDto;
import com.shingu.service.TasksStatusService;

@ManagedBean(name = "tasksStatusBean")
@Scope("request")
@Component
public class TasksStatusBean {

	private List<StatusDto> statusDtos;
	private StatusDto statusDto = new StatusDto();
	@Autowired
	private TasksStatusService tasksStatusServiceImpl;

	public List<StatusDto> getStatusDtos() {
		setStatusDtos(this.tasksStatusServiceImpl.getAllTasksStatuss());
		return statusDtos;
	}

	public void setStatusDtos(List<StatusDto> statusDtos) {
		this.statusDtos = statusDtos;
	}

	public StatusDto getStatusDto() {
		return statusDto;
	}

	public void setStatusDto(StatusDto statusDto) {
		this.statusDto = statusDto;
	}

	public TasksStatusService getTasksStatusServiceImpl() {
		return tasksStatusServiceImpl;
	}

	public void setTasksStatusServiceImpl(TasksStatusService tasksStatusServiceImpl) {
		this.tasksStatusServiceImpl = tasksStatusServiceImpl;
	}

	@Override
	public String toString() {
		return "TasksStatusBean [statusDtos=" + statusDtos + ", statusDto=" + statusDto + ", tasksStatusServiceImpl="
				+ tasksStatusServiceImpl + "]";
	}

	public TasksStatusBean() {
		super();
	}

	public String createTaskStatus() {
		System.out.println("createTaskStatus starts.......................");
		this.tasksStatusServiceImpl.createTaskStatus(statusDto);
		System.out.println(".........................createTaskStatus ends");
		return "status";
	}

	public String editTaskStatus() {
		System.out.println("editTaskStatus starts.......................");
		this.tasksStatusServiceImpl.editTaskStatus(statusDto);
		System.out.println(".........................editTaskStatus ends");
		return "status";
	}

	public String deleteTaskStatus(StatusDto statusDto) {
		System.out.println("deleteTaskClient starts.......................");
		this.tasksStatusServiceImpl.deleteTaskStatus(statusDto);
		System.out.println(".........................deleteTaskClient ends");
		return "status";
	}

	public String findTaskStatusById(StatusDto statusDto) {
		System.out.println("findTaskClientById starts.......................");
		setStatusDto(this.tasksStatusServiceImpl.getTasksStatusById(statusDto.getStatusId()));
		System.out.println(".........................findTaskClientById ends");
		return "manageStatus";
	}

}
