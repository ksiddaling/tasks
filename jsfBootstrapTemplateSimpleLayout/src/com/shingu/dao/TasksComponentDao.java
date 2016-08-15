package com.shingu.dao;

import java.util.List;

import com.shingu.dto.ComponentDto;
import com.shingu.model.Component;

public interface TasksComponentDao {

	public void createTasksComponent(Component component);

	public void editTaskComponent(Component component);

	public void deleteTaskComponent(Component component);

	public List<ComponentDto> getAllTasksComponents();

	public ComponentDto getTasksComponentById(int componentId);

}
