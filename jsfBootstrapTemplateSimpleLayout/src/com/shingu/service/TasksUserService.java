package com.shingu.service;

import java.util.List;

import com.shingu.dto.UserDto;

public interface TasksUserService {

	public void createTaskUser(final String firstName, final String lastName, final String userName, final String email,
			final String password, final String contactNumber);
	
	public void editTaskUser(UserDto userDto);
	
	public void deleteTaskUser(UserDto userDto);
	
	public List<UserDto> getAllTasksUsers();
	
	public UserDto getTasksUserById(int userId);

}
