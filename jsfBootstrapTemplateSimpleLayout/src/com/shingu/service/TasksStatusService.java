package com.shingu.service;

import java.util.List;

import com.shingu.dto.StatusDto;

public interface TasksStatusService {

	public void createTaskStatus(StatusDto statusDto);

	public void editTaskStatus(StatusDto statusDto);

	public void deleteTaskStatus(StatusDto statusDto);

	public List<StatusDto> getAllTasksStatuss();

	public StatusDto getTasksStatusById(int statusId);

}
