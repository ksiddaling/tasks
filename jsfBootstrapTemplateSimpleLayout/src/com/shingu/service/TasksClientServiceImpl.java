package com.shingu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shingu.dao.TasksClientDao;
import com.shingu.dto.ClientDto;
import com.shingu.mapper.ClientMapper;

@Service("tasksClientServiceImpl")
public class TasksClientServiceImpl implements TasksClientService {

	@Autowired
	private TasksClientDao tasksClientDaoImpl;

	public TasksClientDao getTasksClientDaoImpl() {
		return tasksClientDaoImpl;
	}

	public void setTasksClientDaoImpl(TasksClientDao tasksClientDaoImpl) {
		this.tasksClientDaoImpl = tasksClientDaoImpl;
	}

	@Override
	public void createTaskClient(ClientDto clientDto) {
		this.tasksClientDaoImpl.createTasksClient(ClientMapper.createTasksClient(clientDto));
	}

	@Override
	public void editTaskClient(ClientDto clientDto) {
		this.tasksClientDaoImpl.editTaskClient(ClientMapper.getClientFromClientDto(clientDto));
	}

	@Override
	public void deleteTaskClient(ClientDto clientDto) {
		this.tasksClientDaoImpl.deleteTaskClient(ClientMapper.getClientFromClientDto(clientDto));
	}

	@Override
	public List<ClientDto> getAllTasksClients() {
		return this.tasksClientDaoImpl.getAllTasksClients();
	}

	@Override
	public ClientDto getTasksClientById(int clientId) {
		return this.tasksClientDaoImpl.getTasksClientById(clientId);
	}

}
