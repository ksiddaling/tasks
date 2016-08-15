package com.shingu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shingu.dao.TasksPriorityDao;
import com.shingu.dto.PriorityDto;
import com.shingu.mapper.PriorityMapper;

@Service("tasksPriorityServiceImpl")
public class TasksPriorityServiceImpl implements TasksPriorityService {

	@Autowired
	private TasksPriorityDao tasksPriorityDaoImpl;

	public TasksPriorityDao getTasksPriorityDaoImpl() {
		return tasksPriorityDaoImpl;
	}

	public void setTasksPriorityDaoImpl(TasksPriorityDao tasksPriorityDaoImpl) {
		this.tasksPriorityDaoImpl = tasksPriorityDaoImpl;
	}

	@Override
	public void createTaskPriority(PriorityDto priorityDto) {
		this.tasksPriorityDaoImpl.createTasksPriority(PriorityMapper.getPriorityFromPriorityDto(priorityDto));
	}

	@Override
	public void editTaskPriority(PriorityDto priorityDto) {
		this.tasksPriorityDaoImpl.createTasksPriority(PriorityMapper.getPriorityFromPriorityDto(priorityDto));
	}

	@Override
	public void deleteTaskPriority(PriorityDto priorityDto) {
		this.tasksPriorityDaoImpl.deleteTaskPriority(PriorityMapper.getPriorityFromPriorityDto(priorityDto));
	}

	@Override
	public List<PriorityDto> getAllTasksPrioritys() {
		return this.tasksPriorityDaoImpl.getAllTasksPrioritys();
	}

	@Override
	public PriorityDto getTasksPriorityById(int priorityId) {
		return this.tasksPriorityDaoImpl.getTasksPriorityById(priorityId);
	}

}
