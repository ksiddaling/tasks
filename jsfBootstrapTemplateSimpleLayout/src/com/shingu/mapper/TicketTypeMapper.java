package com.shingu.mapper;

import java.util.ArrayList;
import java.util.List;

import com.shingu.dto.ComponentDto;
import com.shingu.dto.TicketTypeDto;
import com.shingu.model.Component;
import com.shingu.model.TicketType;

public class TicketTypeMapper {

	public static TicketType createTasksTicketType(TicketTypeDto ticketTypeDto) {

		return new TicketType(ticketTypeDto.getName());

	}

	public static List<TicketTypeDto> getAllTasksTicketTypes(List<TicketType> ticketTypes) {

		List<TicketTypeDto> ticketTypeDtos = new ArrayList<TicketTypeDto>();
		if (ticketTypes != null && !ticketTypes.isEmpty()) {
			TicketTypeDto ticketTypeDto = null;
			for (TicketType ticketType : ticketTypes) {
				ticketTypeDto = new TicketTypeDto(ticketType.getId(), ticketType.getName());
				ticketTypeDtos.add(ticketTypeDto);
			}
		}
		return ticketTypeDtos;

	}

	public static TicketType getTicketTypeFromTicketTypeDto(TicketTypeDto ticketTypeDto) {

		TicketType ticketType = new TicketType(ticketTypeDto.getId(), ticketTypeDto.getName());
		return ticketType;

	}

	public static TicketTypeDto getTicketTypeDtoFromTicketType(TicketType ticketType) {

		TicketTypeDto ticketTypeDto = new TicketTypeDto(ticketType.getId(), ticketType.getName());
		return ticketTypeDto;

	}

}
