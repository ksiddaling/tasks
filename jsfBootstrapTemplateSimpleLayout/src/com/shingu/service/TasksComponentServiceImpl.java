package com.shingu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shingu.dao.TasksComponentDao;
import com.shingu.dto.ComponentDto;
import com.shingu.mapper.ComponentMapper;

@Service("tasksComponentServiceImpl")
public class TasksComponentServiceImpl implements TasksComponentService {

	@Autowired
	private TasksComponentDao tasksComponentDaoImpl;

	public TasksComponentDao getTasksComponentDaoImpl() {
		return tasksComponentDaoImpl;
	}

	public void setTasksComponentDaoImpl(TasksComponentDao tasksComponentDaoImpl) {
		this.tasksComponentDaoImpl = tasksComponentDaoImpl;
	}

	@Override
	public void createTaskComponent(ComponentDto componentDto) {
		this.tasksComponentDaoImpl.createTasksComponent(ComponentMapper.getComponentFromComponentDto(componentDto));
	}

	@Override
	public void editTaskComponent(ComponentDto componentDto) {
		this.tasksComponentDaoImpl.editTaskComponent(ComponentMapper.getComponentFromComponentDto(componentDto));
	}

	@Override
	public void deleteTaskComponent(ComponentDto componentDto) {
		this.tasksComponentDaoImpl.deleteTaskComponent(ComponentMapper.getComponentFromComponentDto(componentDto));
	}

	@Override
	public List<ComponentDto> getAllTasksComponents() {
		return this.tasksComponentDaoImpl.getAllTasksComponents();
	}

	@Override
	public ComponentDto getTasksComponentById(int componentId) {
		return this.tasksComponentDaoImpl.getTasksComponentById(componentId);
	}

}
