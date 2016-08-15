package com.shingu.dao;

import java.util.List;

import com.shingu.dto.PriorityDto;
import com.shingu.model.Priority;

public interface TasksPriorityDao {

	public void createTasksPriority(Priority priority);

	public void editTaskPriority(Priority priority);

	public void deleteTaskPriority(Priority priority);

	public List<PriorityDto> getAllTasksPrioritys();

	public PriorityDto getTasksPriorityById(int priorityId);

}
