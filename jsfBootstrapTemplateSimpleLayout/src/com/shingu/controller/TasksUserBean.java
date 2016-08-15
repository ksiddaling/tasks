package com.shingu.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shingu.dto.UserDto;
import com.shingu.service.TasksUserService;

@ManagedBean(name = "tasksUserBean")
@Scope("request")
@Component
public class TasksUserBean {

	private String confirmPassword;
	private List<UserDto> userDtos;
	private UserDto userDto = new UserDto();
	@Autowired
	private TasksUserService tasksUserServiceImpl;

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public List<UserDto> getUserDtos() {
		setUserDtos(this.tasksUserServiceImpl.getAllTasksUsers());
		return userDtos;
	}

	public void setUserDtos(List<UserDto> userDtos) {
		this.userDtos = userDtos;
	}

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}

	public TasksUserService getTasksUserServiceImpl() {
		return tasksUserServiceImpl;
	}

	public void setTasksUserServiceImpl(TasksUserService tasksUserServiceImpl) {
		this.tasksUserServiceImpl = tasksUserServiceImpl;
	}

	@Override
	public String toString() {
		return "TasksUserBean [confirmPassword=" + confirmPassword + ", userDtos=" + userDtos + ", userDto=" + userDto
				+ ", tasksUserServiceImpl=" + tasksUserServiceImpl + "]";
	}

	public TasksUserBean() {
		super();
	}

	public String createTaskUser() {
		System.out.println("createUser starts.......................");
		this.tasksUserServiceImpl.createTaskUser(userDto.getFirstName(), userDto.getLastName(), userDto.getMiddleName(),
				userDto.getEmail(), userDto.getPassword(), userDto.getContactNumber());
		System.out.println(".........................createUser ends");
		return "users";
	}

	public String editTaskUser() {
		System.out.println("createUser starts.......................");
		this.tasksUserServiceImpl.editTaskUser(userDto);
		System.out.println(".........................createUser ends");
		return "users";
	}

	public String deleteTaskUser(UserDto userDto) {
		System.out.println("createUser starts.......................");
		this.tasksUserServiceImpl.deleteTaskUser(userDto);
		System.out.println(".........................createUser ends");
		return "users";
	}

	public String findTaskUserById(UserDto userDto) {
		System.out.println("createUser starts.......................");
		setUserDto(this.tasksUserServiceImpl.getTasksUserById(userDto.getId()));
		System.out.println(getUserDto());
		System.out.println(".........................createUser ends");
		return "manageUser";
	}

}
