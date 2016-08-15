package com.shingu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.shingu.dto.ComponentDto;
import com.shingu.dto.TicketTypeDto;
import com.shingu.mapper.ComponentMapper;
import com.shingu.mapper.TicketTypeMapper;
import com.shingu.model.Component;
import com.shingu.model.TicketType;
import com.shingu.util.MyHibernateDaoSupport;

@Repository("tasksTicketTypeDaoImpl")
public class TasksTicketTypeDaoImpl extends MyHibernateDaoSupport implements TasksTicketTypeDao {

	@Override
	public void createTasksTicketType(TicketType ticketType) {
		System.out.println("createTasksTickeType starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.saveOrUpdate(ticketType);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("createTasksTickeType ends");
	}

	@Override
	public void editTaskTicketType(TicketType ticketType) {

		System.out.println("editTaskComponent starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.saveOrUpdate(ticketType);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("editTaskComponent ends");

	}

	@Override
	public void deleteTaskTicketType(TicketType ticketType) {

		System.out.println("deleteTaskComponent starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.delete(ticketType);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("deleteTaskComponent ends");

	}

	@Override
	public List<TicketTypeDto> getAllTasksTicketTypes() {
		Session session = null;
		List<TicketTypeDto> ticketTypeDtos = new ArrayList<TicketTypeDto>();
		try {
			session = getSession();
			Query query = session.createQuery("from TicketType");
			List<TicketType> ticketTypes = query.list();
			System.out.println(ticketTypes.size());
			ticketTypeDtos = TicketTypeMapper.getAllTasksTicketTypes(ticketTypes);
		} finally {
			releaseSession(session);
		}
		return ticketTypeDtos;
	}

	@Override
	public TicketTypeDto getTasksTicketTypeById(int ticketTypeId) {
		System.out.println("getAllTasksTicketTypeById starts");
		Session theSession = null;
		Transaction tx = null;
		TicketTypeDto ticketTypeDto = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			TicketType ticketType = (TicketType) theSession.get(TicketType.class, ticketTypeId);
			ticketTypeDto = TicketTypeMapper.getTicketTypeDtoFromTicketType(ticketType);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("getAllTasksTicketTypeById ends");
		return ticketTypeDto;
	}

}
