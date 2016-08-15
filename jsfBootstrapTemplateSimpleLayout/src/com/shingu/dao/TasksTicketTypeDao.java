package com.shingu.dao;

import java.util.List;

import com.shingu.dto.TicketTypeDto;
import com.shingu.model.TicketType;

public interface TasksTicketTypeDao {

	public void createTasksTicketType(TicketType ticketType);

	public void editTaskTicketType(TicketType ticketType);

	public void deleteTaskTicketType(TicketType ticketType);

	public List<TicketTypeDto> getAllTasksTicketTypes();

	public TicketTypeDto getTasksTicketTypeById(int ticketTypeId);

}
