package com.shingu.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shingu.dto.ComponentDto;
import com.shingu.dto.PriorityDto;
import com.shingu.service.TasksComponentService;
import com.shingu.service.TasksPriorityService;

@ManagedBean(name = "tasksPriorityBean")
@Scope("request")
@Component
public class TasksPriorityBean {

	private List<PriorityDto> priorityDtos;
	private PriorityDto priorityDto = new PriorityDto();
	@Autowired
	private TasksPriorityService tasksPriorityServiceImpl;

	@Override
	public String toString() {
		return "TasksPriorityBean [priorityDtos=" + priorityDtos + ", priorityDto=" + priorityDto
				+ ", tasksPriorityServiceImpl=" + tasksPriorityServiceImpl + "]";
	}

	public List<PriorityDto> getPriorityDtos() {
		setPriorityDtos(this.tasksPriorityServiceImpl.getAllTasksPrioritys());
		return priorityDtos;
	}

	public void setPriorityDtos(List<PriorityDto> priorityDtos) {
		this.priorityDtos = priorityDtos;
	}

	public PriorityDto getPriorityDto() {
		return priorityDto;
	}

	public void setPriorityDto(PriorityDto priorityDto) {
		this.priorityDto = priorityDto;
	}

	public TasksPriorityService getTasksPriorityServiceImpl() {
		return tasksPriorityServiceImpl;
	}

	public void setTasksPriorityServiceImpl(TasksPriorityService tasksPriorityServiceImpl) {
		this.tasksPriorityServiceImpl = tasksPriorityServiceImpl;
	}

	public TasksPriorityBean() {
		super();
	}

	public String createTaskPriority() {
		System.out.println("createTaskPriority starts.......................");
		this.tasksPriorityServiceImpl.createTaskPriority(priorityDto);
		System.out.println(".........................createTaskPriority ends");
		return "priority";
	}

	public String editTaskPriority() {
		System.out.println("editTaskPriority starts.......................");
		this.tasksPriorityServiceImpl.editTaskPriority(priorityDto);
		System.out.println(".........................editTaskPriority ends");
		return "priority";
	}

	public String deleteTaskPriority(PriorityDto priorityDto) {
		System.out.println("deleteTaskPriority starts.......................");
		this.tasksPriorityServiceImpl.deleteTaskPriority(priorityDto);
		System.out.println(".........................deleteTaskPriority ends");
		return "priority";
	}

	public String findTaskPriorityById(PriorityDto priorityDto) {
		System.out.println("findTaskPriorityById starts.......................");
		setPriorityDto(this.tasksPriorityServiceImpl.getTasksPriorityById(priorityDto.getId()));
		System.out.println(".........................findTaskPriorityById ends");
		return "managePriority";
	}

}
