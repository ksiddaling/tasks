package com.shingu.mapper;

import java.util.ArrayList;
import java.util.List;

import com.shingu.dto.PriorityDto;
import com.shingu.model.Priority;

public class PriorityMapper {

	public static Priority createTasksPriority(PriorityDto priorityDto) {

		return new Priority(priorityDto.getName());

	}

	public static List<PriorityDto> getAllTasksPrioritys(List<Priority> priorities) {

		List<PriorityDto> priorityDtos = new ArrayList<PriorityDto>();
		if (priorities != null && !priorities.isEmpty()) {
			PriorityDto priorityDto = null;
			for (Priority priority : priorities) {
				priorityDto = new PriorityDto(priority.getId(), priority.getName());
				priorityDtos.add(priorityDto);
			}
		}
		return priorityDtos;

	}

	public static Priority getPriorityFromPriorityDto(PriorityDto priorityDto) {

		Priority priority= new Priority(priorityDto.getId(), priorityDto.getName());
		return priority;

	}

	public static PriorityDto getPriorityDtoFromPriority(Priority priority) {

		PriorityDto priorityDto = new PriorityDto(priority.getId(), priority.getName());
		return priorityDto;

	}

}
