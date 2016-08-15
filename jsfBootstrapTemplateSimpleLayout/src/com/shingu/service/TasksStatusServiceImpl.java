package com.shingu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shingu.dao.TasksStatusDao;
import com.shingu.dto.StatusDto;
import com.shingu.mapper.ComponentMapper;
import com.shingu.mapper.StatusMapper;

@Service("tasksStatusServiceImpl")
public class TasksStatusServiceImpl implements TasksStatusService {

	@Autowired
	private TasksStatusDao tasksStatusDaoImpl;

	public TasksStatusDao getTasksStatusDaoImpl() {
		return tasksStatusDaoImpl;
	}

	public void setTasksStatusDaoImpl(TasksStatusDao tasksStatusDaoImpl) {
		this.tasksStatusDaoImpl = tasksStatusDaoImpl;
	}

	@Override
	public void createTaskStatus(StatusDto statusDto) {
		this.tasksStatusDaoImpl.createTasksStatus(StatusMapper.getStatusFromStatusDto(statusDto));
	}

	@Override
	public void editTaskStatus(StatusDto statusDto) {
		this.tasksStatusDaoImpl.editTaskStatus(StatusMapper.getStatusFromStatusDto(statusDto));
	}

	@Override
	public void deleteTaskStatus(StatusDto statusDto) {
		this.tasksStatusDaoImpl.deleteTaskStatus(StatusMapper.getStatusFromStatusDto(statusDto));
	}

	@Override
	public List<StatusDto> getAllTasksStatuss() {
		return this.tasksStatusDaoImpl.getAllTasksStatuss();
		}

	@Override
	public StatusDto getTasksStatusById(int statusId) {
		return this.tasksStatusDaoImpl.getTasksStatusById(statusId);
	}

}
