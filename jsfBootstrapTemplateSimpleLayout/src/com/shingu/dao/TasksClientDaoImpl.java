package com.shingu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.shingu.dto.ClientDto;
import com.shingu.mapper.ClientMapper;
import com.shingu.model.Client;
import com.shingu.util.MyHibernateDaoSupport;

@Repository("tasksClientDaoImpl")
public class TasksClientDaoImpl extends MyHibernateDaoSupport implements TasksClientDao {

	@Override
	public void createTasksClient(Client client) {
		System.out.println("createTasksClient starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.saveOrUpdate(client);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("createTasksClient ends");

	}

	@Override
	public void editTaskClient(Client client) {

		System.out.println("editTaskClient starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.saveOrUpdate(client);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("editTaskClient ends");

	}

	@Override
	public void deleteTaskClient(Client client) {

		System.out.println("deleteTaskClient starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.delete(client);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("deleteTaskClient ends");

	}

	@Override
	public List<ClientDto> getAllTasksClients() {
		Session session = null;
		List<ClientDto> clientDtos = new ArrayList<ClientDto>();
		try {
			session = getSession();
			Query query = session.createQuery("from Client");
			List<Client> clients = query.list();
			System.out.println(clients.size());

			clientDtos = ClientMapper.getAllTasksClients(clients);
		} finally {
			releaseSession(session);
		}
		return clientDtos;
	}

	@Override
	public ClientDto getTasksClientById(int clientId) {
		System.out.println("deleteTaskUser starts");
		Session theSession = null;
		Transaction tx = null;
		ClientDto clientDto = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			Client client = (Client) theSession.get(Client.class, clientId);
			clientDto = ClientMapper.getClientDtoFromClient(client);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("deleteTaskUser ends");
		return clientDto;
	}

}
