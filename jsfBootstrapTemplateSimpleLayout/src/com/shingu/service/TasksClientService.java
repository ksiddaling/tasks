package com.shingu.service;

import java.util.List;

import com.shingu.dto.ClientDto;

public interface TasksClientService {
	
	public void createTaskClient(ClientDto clientDto);
	
	public void editTaskClient(ClientDto clientDto);
	
	public void deleteTaskClient(ClientDto clientDto);
	
	public List<ClientDto> getAllTasksClients();
	
	public ClientDto getTasksClientById(int clientId);

}
