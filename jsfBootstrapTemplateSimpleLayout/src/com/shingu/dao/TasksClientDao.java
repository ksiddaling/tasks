package com.shingu.dao;

import java.util.List;

import com.shingu.dto.ClientDto;
import com.shingu.model.Client;

public interface TasksClientDao {

	public void createTasksClient(Client client);

	public void editTaskClient(Client client);

	public void deleteTaskClient(Client client);

	public List<ClientDto> getAllTasksClients();

	public ClientDto getTasksClientById(int clientId);

}
