package com.shingu.service;

import java.util.List;

import com.shingu.dto.ComponentDto;

public interface TasksComponentService {

	public void createTaskComponent(ComponentDto componentDto);

	public void editTaskComponent(ComponentDto componentDto);

	public void deleteTaskComponent(ComponentDto componentDto);

	public List<ComponentDto> getAllTasksComponents();

	public ComponentDto getTasksComponentById(int componentId);

}
