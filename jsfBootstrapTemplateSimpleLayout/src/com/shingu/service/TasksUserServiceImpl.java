package com.shingu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shingu.dao.TasksUserDao;
import com.shingu.dto.UserDto;
import com.shingu.mapper.UserMapper;

@Service("tasksUserServiceImpl")
public class TasksUserServiceImpl implements TasksUserService {

	@Autowired
	private TasksUserDao tasksUserDaoImpl;

	public TasksUserDao getTasksUserDaoImpl() {
		return tasksUserDaoImpl;
	}

	public void setTasksUserDaoImpl(TasksUserDao tasksUserDaoImpl) {
		this.tasksUserDaoImpl = tasksUserDaoImpl;
	}

	@Override
	public void createTaskUser(String firstName, String lastName, String userName, String email, String password,
			final String contactNumber) {
		this.tasksUserDaoImpl.createTasksUser(
				UserMapper.createTasksUser(firstName, lastName, userName, email, password, contactNumber));
	}

	@Override
	public List<UserDto> getAllTasksUsers() {
		return this.tasksUserDaoImpl.getAllTasksUsers();
	}

	@Override
	public void editTaskUser(UserDto userDto) {
		this.tasksUserDaoImpl.editTaskUser(UserMapper.getUserFromUserDto(userDto));
	}

	@Override
	public void deleteTaskUser(UserDto userDto) {
		this.tasksUserDaoImpl.deleteTaskUser(UserMapper.getUserFromUserDto(userDto));
	}

	@Override
	public UserDto getTasksUserById(int userId) {
		return this.tasksUserDaoImpl.getTasksUserById(userId);
	}

}
