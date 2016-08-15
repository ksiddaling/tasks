package com.shingu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.shingu.dto.ComponentDto;
import com.shingu.dto.StatusDto;
import com.shingu.mapper.ComponentMapper;
import com.shingu.mapper.StatusMapper;
import com.shingu.model.Component;
import com.shingu.model.Status;
import com.shingu.util.MyHibernateDaoSupport;

@Repository("tasksStatusDaoImpl")
public class TasksStatusDaoImpl extends MyHibernateDaoSupport implements TasksStatusDao{

	@Override
	public void createTasksStatus(Status status) {
		System.out.println("createTasksStatus starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.saveOrUpdate(status);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("createTasksStatus ends");
	}

	@Override
	public void editTaskStatus(Status status) {
		System.out.println("editTaskStatus starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.saveOrUpdate(status);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("editTaskStatus ends");
		
	}

	@Override
	public void deleteTaskStatus(Status status) {
		System.out.println("deleteTaskComponent starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.delete(status);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("deleteTaskComponent ends");
		
	}

	@Override
	public List<StatusDto> getAllTasksStatuss() {
		Session session = null;
		List<StatusDto> statusDtos = new ArrayList<StatusDto>();
		try {
			session = getSession();
			Query query = session.createQuery("from Status");
			List<Status> status = query.list();
			System.out.println(status.size());

			statusDtos = StatusMapper.getAllTasksStatus(status);
		} finally {
			releaseSession(session);
		}
		return statusDtos;
	}

	@Override
	public StatusDto getTasksStatusById(int statusId) {
		System.out.println("getAllTasksStatusById starts");
		Session theSession = null;
		Transaction tx = null;
		StatusDto statusDto = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			Status status= (Status) theSession.get(Status.class, statusId);
			statusDto = StatusMapper.getStatusDtoFromStatus(status);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("getAllTasksStatusById ends");
		return statusDto;
	}

}
