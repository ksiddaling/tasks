package com.shingu.mapper;

import java.util.ArrayList;
import java.util.List;

import com.shingu.dto.ClientDto;
import com.shingu.model.Client;

public class ClientMapper {

	public static Client createTasksClient(ClientDto clientDto) {

		return new Client(clientDto.getContactNumber(), clientDto.getFirstName(), clientDto.getLastName(),
				clientDto.getMiddleName());

	}

	public static List<ClientDto> getAllTasksClients(List<Client> clients) {

		List<ClientDto> clientDtos = new ArrayList<ClientDto>();
		if (clients != null && !clients.isEmpty()) {
			ClientDto clientDto = null;
			for (Client client : clients) {
				clientDto = new ClientDto();
				clientDto.setContactNumber(client.getContactNumber());
				clientDto.setFirstName(client.getFirstName());
				clientDto.setId(client.getId());
				clientDto.setLastName(client.getLastName());
				clientDto.setMiddleName(client.getMiddleName());
				clientDtos.add(clientDto);
			}
		}
		return clientDtos;

	}

	public static Client getClientFromClientDto(ClientDto clientDto) {

		Client client = new Client();
		client.setId(clientDto.getId());
		client.setFirstName(clientDto.getFirstName());
		client.setMiddleName(clientDto.getMiddleName());
		client.setLastName(clientDto.getLastName());
		client.setContactNumber(clientDto.getContactNumber());
		return client;

	}

	public static ClientDto getClientDtoFromClient(Client client) {

		ClientDto clientDto = new ClientDto();
		clientDto.setId(client.getId());
		clientDto.setFirstName(client.getFirstName());
		clientDto.setMiddleName(client.getMiddleName());
		clientDto.setLastName(client.getLastName());
		clientDto.setContactNumber(client.getContactNumber());
		return clientDto;

	}

}
