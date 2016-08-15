package com.shingu.dao;

import java.util.List;

import com.shingu.dto.StatusDto;
import com.shingu.model.Status;

public interface TasksStatusDao {

	public void createTasksStatus(Status status);

	public void editTaskStatus(Status status);

	public void deleteTaskStatus(Status status);

	public List<StatusDto> getAllTasksStatuss();

	public StatusDto getTasksStatusById(int statusId);

}
