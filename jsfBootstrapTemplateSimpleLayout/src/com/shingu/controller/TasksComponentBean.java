package com.shingu.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shingu.dto.ComponentDto;
import com.shingu.service.TasksComponentService;

@ManagedBean(name = "tasksComponentBean")
@Scope("request")
@Component
public class TasksComponentBean {

	private List<ComponentDto> componentDtos;
	private ComponentDto componentDto = new ComponentDto();
	@Autowired
	private TasksComponentService tasksComponentServiceImpl;

	public List<ComponentDto> getComponentDtos() {
		setComponentDtos(this.tasksComponentServiceImpl.getAllTasksComponents());
		return componentDtos;
	}

	public void setComponentDtos(List<ComponentDto> componentDtos) {
		this.componentDtos = componentDtos;
	}

	public ComponentDto getComponentDto() {
		return componentDto;
	}

	public void setComponentDto(ComponentDto componentDto) {
		this.componentDto = componentDto;
	}

	public TasksComponentService getTasksComponentServiceImpl() {
		return tasksComponentServiceImpl;
	}

	public void setTasksComponentServiceImpl(TasksComponentService tasksComponentServiceImpl) {
		this.tasksComponentServiceImpl = tasksComponentServiceImpl;
	}

	@Override
	public String toString() {
		return "TasksComponentBean [componentDtos=" + componentDtos + ", componentDto=" + componentDto
				+ ", tasksComponentServiceImpl=" + tasksComponentServiceImpl + "]";
	}

	public TasksComponentBean() {
		super();
	}

	public String createTaskComponent() {
		System.out.println("createTaskClient starts.......................");
		this.tasksComponentServiceImpl.createTaskComponent(componentDto);
		System.out.println(".........................createTaskClient ends");
		return "components";
	}

	public String editTaskComponent() {
		System.out.println("editTaskClient starts.......................");
		this.tasksComponentServiceImpl.editTaskComponent(componentDto);
		System.out.println(".........................editTaskClient ends");
		return "components";
	}

	public String deleteTaskComponent(ComponentDto componentDto) {
		System.out.println("deleteTaskClient starts.......................");
		this.tasksComponentServiceImpl.deleteTaskComponent(componentDto);
		System.out.println(".........................deleteTaskClient ends");
		return "components";
	}

	public String findTaskComponentById(ComponentDto componentDto) {
		System.out.println("findTaskClientById starts.......................");
		setComponentDto(this.tasksComponentServiceImpl.getTasksComponentById(componentDto.getId()));
		System.out.println(".........................findTaskClientById ends");
		return "manageComponent";
	}

}
