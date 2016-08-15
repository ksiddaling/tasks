package com.shingu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.shingu.dto.UserDto;
import com.shingu.mapper.UserMapper;
import com.shingu.model.User;
import com.shingu.util.MyHibernateDaoSupport;

@Repository("tasksUserDaoImpl")
public class TasksUserDaoImpl extends MyHibernateDaoSupport implements TasksUserDao {

	@Override
	public void createTasksUser(User user) {
		System.out.println("createUserDao starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.saveOrUpdate(user);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("createUserDao ends");
	}

	@Override
	public List<UserDto> getAllTasksUsers() {
		Session session = null;
		List<UserDto> userDtos = new ArrayList<UserDto>();
		try {
			session = getSession();
			Query query = session.createQuery("from User");
			List<User> users = query.list();
			System.out.println(users.size());

			userDtos = UserMapper.getAllTasksUsers(users);
		} finally {
			releaseSession(session);
		}
		return userDtos;
	}

	@Override
	public void editTaskUser(User user) {
		System.out.println("editTaskUser starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.saveOrUpdate(user);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("editTaskUser ends");
	}

	@Override
	public void deleteTaskUser(User user) {
		System.out.println("deleteTaskUser starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.delete(user);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("deleteTaskUser ends");
	}

	@Override
	public UserDto getTasksUserById(int userId) {
		System.out.println("deleteTaskUser starts");
		Session theSession = null;
		Transaction tx = null;
		UserDto userDto = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			User user = (User)theSession.get(User.class, userId);
			userDto = UserMapper.getUserDtoFromUser(user);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("deleteTaskUser ends");
		return userDto;
	}

}
