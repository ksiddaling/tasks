package com.shingu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.shingu.dto.ComponentDto;
import com.shingu.mapper.ComponentMapper;
import com.shingu.model.Component;
import com.shingu.util.MyHibernateDaoSupport;

@Repository("tasksComponentDaoImpl")
public class TasksComponentDaoImpl extends MyHibernateDaoSupport implements TasksComponentDao {

	@Override
	public void createTasksComponent(Component component) {
		System.out.println("createTasksComponent starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.saveOrUpdate(component);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("createTasksComponent ends");
	}

	@Override
	public void editTaskComponent(Component component) {

		System.out.println("editTaskComponent starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.saveOrUpdate(component);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("editTaskComponent ends");

	}

	@Override
	public void deleteTaskComponent(Component component) {

		System.out.println("deleteTaskComponent starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.delete(component);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("deleteTaskComponent ends");

	}

	@Override
	public List<ComponentDto> getAllTasksComponents() {
		Session session = null;
		List<ComponentDto> componentDtos = new ArrayList<ComponentDto>();
		try {
			session = getSession();
			Query query = session.createQuery("from Component");
			List<Component> components = query.list();
			System.out.println(components.size());

			componentDtos = ComponentMapper.getAllTasksComponents(components);
		} finally {
			releaseSession(session);
		}
		return componentDtos;
	}

	@Override
	public ComponentDto getTasksComponentById(int componentId) {
		System.out.println("getAllTasksComponentById starts");
		Session theSession = null;
		Transaction tx = null;
		ComponentDto componentDto = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			Component component = (Component) theSession.get(Component.class, componentId);
			componentDto = ComponentMapper.getComponentDtoFromComponent(component);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("getAllTasksComponentById ends");
		return componentDto;
	}

}
