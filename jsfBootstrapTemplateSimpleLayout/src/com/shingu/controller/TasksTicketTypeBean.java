package com.shingu.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shingu.dto.TicketTypeDto;
import com.shingu.service.TasksTicketTypeService;

@ManagedBean(name = "tasksTicketTypeBean")
@Scope("request")
@Component
public class TasksTicketTypeBean {

	private List<TicketTypeDto> ticketTypeDtos;
	private TicketTypeDto ticketTypeDto = new TicketTypeDto();
	@Autowired
	private TasksTicketTypeService tasksTicketTypeServiceImpl;

	public List<TicketTypeDto> getTicketTypeDtos() {
		setTicketTypeDtos(this.tasksTicketTypeServiceImpl.getAllTasksTicketTypes());
		return ticketTypeDtos;
	}

	public void setTicketTypeDtos(List<TicketTypeDto> ticketTypeDtos) {
		this.ticketTypeDtos = ticketTypeDtos;
	}

	public TicketTypeDto getTicketTypeDto() {
		return ticketTypeDto;
	}

	public void setTicketTypeDto(TicketTypeDto ticketTypeDto) {
		this.ticketTypeDto = ticketTypeDto;
	}

	public TasksTicketTypeService getTasksTicketTypeServiceImpl() {
		return tasksTicketTypeServiceImpl;
	}

	public void setTasksTicketTypeServiceImpl(TasksTicketTypeService tasksTicketTypeServiceImpl) {
		this.tasksTicketTypeServiceImpl = tasksTicketTypeServiceImpl;
	}

	public TasksTicketTypeBean() {
		super();
	}

	public String createTaskTicketType() {
		System.out.println("createTaskTicketType starts.......................");
		this.tasksTicketTypeServiceImpl.createTaskTicketType(ticketTypeDto);
		System.out.println(".........................createTaskTicketType ends");
		return "ticketType";
	}

	public String deleteTaskTicketType(TicketTypeDto ticketTypeDto) {
		System.out.println("deleteTaskTicketType starts.......................");
		this.tasksTicketTypeServiceImpl.deleteTaskTicketType(ticketTypeDto);
		System.out.println(".........................deleteTaskTicketType ends");
		return "ticketType";
	}

	public String findTaskTicketTypeById(TicketTypeDto ticketTypeDto) {
		System.out.println("findTaskTicketTypeById starts.......................");
		setTicketTypeDto(this.tasksTicketTypeServiceImpl.getTasksTicketTypeById(ticketTypeDto.getId()));
		System.out.println(".........................findTaskTicketTypeById ends");
		return "manageTicketType";
	}

}
