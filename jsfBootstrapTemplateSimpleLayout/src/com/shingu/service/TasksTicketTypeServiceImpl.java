package com.shingu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shingu.dao.TasksTicketTypeDao;
import com.shingu.dto.TicketTypeDto;
import com.shingu.mapper.ComponentMapper;
import com.shingu.mapper.TicketTypeMapper;

@Service("tasksTicketTypeServiceImpl")
public class TasksTicketTypeServiceImpl implements TasksTicketTypeService {

	@Autowired
	private TasksTicketTypeDao tasksTicketTypeDaoImpl;

	public TasksTicketTypeDao getTasksTicketTypeDaoImpl() {
		return tasksTicketTypeDaoImpl;
	}

	public void setTasksTicketTypeDaoImpl(TasksTicketTypeDao tasksTicketTypeDaoImpl) {
		this.tasksTicketTypeDaoImpl = tasksTicketTypeDaoImpl;
	}

	@Override
	public void createTaskTicketType(TicketTypeDto ticketTypeDto) {
		this.tasksTicketTypeDaoImpl
				.createTasksTicketType(TicketTypeMapper.getTicketTypeFromTicketTypeDto(ticketTypeDto));
	}

	@Override
	public void editTaskTicketType(TicketTypeDto ticketTypeDto) {
		this.tasksTicketTypeDaoImpl.editTaskTicketType(TicketTypeMapper.getTicketTypeFromTicketTypeDto(ticketTypeDto));
	}

	@Override
	public void deleteTaskTicketType(TicketTypeDto ticketTypeDto) {
		this.tasksTicketTypeDaoImpl
				.deleteTaskTicketType(TicketTypeMapper.getTicketTypeFromTicketTypeDto(ticketTypeDto));
	}

	@Override
	public List<TicketTypeDto> getAllTasksTicketTypes() {
		return this.tasksTicketTypeDaoImpl.getAllTasksTicketTypes();
	}

	@Override
	public TicketTypeDto getTasksTicketTypeById(int ticketTypeId) {
		return this.tasksTicketTypeDaoImpl.getTasksTicketTypeById(ticketTypeId);
	}

}
