package com.shingu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.shingu.dto.PriorityDto;
import com.shingu.mapper.PriorityMapper;
import com.shingu.model.Priority;
import com.shingu.util.MyHibernateDaoSupport;

@Repository("tasksPriorityDaoImpl")
public class TasksPriorityDaoImpl extends MyHibernateDaoSupport implements TasksPriorityDao {

	@Override
	public void createTasksPriority(Priority priority) {
		System.out.println("createTasksPriority starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.saveOrUpdate(priority);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("createTasksPriority ends");

	}

	@Override
	public void editTaskPriority(Priority priority) {
		System.out.println("editTaskPriority starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.saveOrUpdate(priority);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("editTaskPriority ends");

	}

	@Override
	public void deleteTaskPriority(Priority priority) {
		System.out.println("deleteTaskPriority starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.delete(priority);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("deleteTaskPriority ends");

	}

	@Override
	public List<PriorityDto> getAllTasksPrioritys() {
		Session session = null;
		List<PriorityDto> priorityDtos = new ArrayList<PriorityDto>();
		try {
			session = getSession();
			Query query = session.createQuery("from Priority");
			List<Priority> priorities = query.list();
			System.out.println(priorities.size());

			priorityDtos = PriorityMapper.getAllTasksPrioritys(priorities);
		} finally {
			releaseSession(session);
		}
		return priorityDtos;
	}

	@Override
	public PriorityDto getTasksPriorityById(int priorityId) {
		System.out.println("getTasksPriorityById starts");
		Session theSession = null;
		Transaction tx = null;
		PriorityDto priorityDto = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			Priority priority = (Priority) theSession.get(Priority.class, priorityId);
			priorityDto = PriorityMapper.getPriorityDtoFromPriority(priority);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("getTasksPriorityById ends");
		return priorityDto;
	}

}
