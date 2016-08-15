package com.shingu.service;

import java.util.List;

import com.shingu.dto.PriorityDto;

public interface TasksPriorityService {

	public void createTaskPriority(PriorityDto priorityDto);

	public void editTaskPriority(PriorityDto priorityDto);

	public void deleteTaskPriority(PriorityDto priorityDto);

	public List<PriorityDto> getAllTasksPrioritys();

	public PriorityDto getTasksPriorityById(int priorityId);

}
