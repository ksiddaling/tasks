package com.shingu.service;

import java.util.List;

import com.shingu.dto.TicketTypeDto;

public interface TasksTicketTypeService {

	public void createTaskTicketType(TicketTypeDto ticketTypeDto);

	public void editTaskTicketType(TicketTypeDto ticketTypeDto);

	public void deleteTaskTicketType(TicketTypeDto ticketTypeDto);

	public List<TicketTypeDto> getAllTasksTicketTypes();

	public TicketTypeDto getTasksTicketTypeById(int ticketTypeId);

}
