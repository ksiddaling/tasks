package com.shingu.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shingu.dto.ClientDto;
import com.shingu.service.TasksClientService;

@ManagedBean(name = "tasksClientBean")
@Scope("request")
@Component
public class TasksClientBean {

	private List<ClientDto> clientDtos;
	private ClientDto clientDto = new ClientDto();
	@Autowired
	private TasksClientService TaskClientServiceImpl;

	public List<ClientDto> getClientDtos() {
		setClientDtos(this.TaskClientServiceImpl.getAllTasksClients());
		return clientDtos;
	}

	public void setClientDtos(List<ClientDto> clientDtos) {
		this.clientDtos = clientDtos;
	}

	public ClientDto getClientDto() {
		return clientDto;
	}

	public void setClientDto(ClientDto clientDto) {
		this.clientDto = clientDto;
	}

	public TasksClientService getTaskClientServiceImpl() {
		return TaskClientServiceImpl;
	}

	public void setTaskClientServiceImpl(TasksClientService taskClientServiceImpl) {
		TaskClientServiceImpl = taskClientServiceImpl;
	}

	@Override
	public String toString() {
		return "TasksClientBean [clientDtos=" + clientDtos + ", clientDto=" + clientDto + ", TaskClientServiceImpl="
				+ TaskClientServiceImpl + "]";
	}

	public TasksClientBean() {
		super();
	}

	public String createTaskClient() {
		System.out.println("createTaskClient starts.......................");
		this.TaskClientServiceImpl.createTaskClient(clientDto);
		System.out.println(".........................createTaskClient ends");
		return "clients";
	}

	public String editTaskClient() {
		System.out.println("editTaskClient starts.......................");
		this.TaskClientServiceImpl.editTaskClient(clientDto);
		System.out.println(".........................editTaskClient ends");
		return "clients";
	}

	public String deleteTaskClient(ClientDto clientDto) {
		System.out.println("deleteTaskClient starts.......................");
		this.TaskClientServiceImpl.deleteTaskClient(clientDto);
		System.out.println(".........................deleteTaskClient ends");
		return "clients";
	}

	public String findTaskClientById(ClientDto clientDto) {
		System.out.println("findTaskClientById starts.......................");
		setClientDto(this.TaskClientServiceImpl.getTasksClientById(clientDto.getId()));
		System.out.println(".........................findTaskClientById ends");
		return "manageClient";
	}

}
