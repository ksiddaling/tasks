package com.shingu.dao;

import java.util.List;

import com.shingu.dto.UserDto;
import com.shingu.model.User;

public interface TasksUserDao {

	public void createTasksUser(User user);

	public void editTaskUser(User user);

	public void deleteTaskUser(User userFs);

	public List<UserDto> getAllTasksUsers();
	
	public UserDto getTasksUserById(int userId);

}
