package com.shingu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shingu.dao.LoginDao;
import com.shingu.dao.LoginDaoImpl;

@Component("loginServiceImpl")
public class LoginServiceImpl implements LoginService {

	/*
	 * @Autowired LoginDaoImpl loginDaoImpl;
	 * 
	 * public LoginDaoImpl getLoginDaoImpl() {
	 * System.out.println("getLoginDaoImpl"); return loginDaoImpl; }
	 * 
	 * public void setLoginDaoImpl(LoginDaoImpl loginDaoImpl) {
	 * this.loginDaoImpl = loginDaoImpl; System.out.println("setLoginDaoImpl");
	 * }
	 */

	@Autowired
	LoginDao loginDaoImpl;

	public LoginDao getLoginDaoImpl() {
		System.out.println("getLoginDaoImpl");
		return loginDaoImpl;
	}

	public void setLoginDaoImpl(LoginDaoImpl loginDaoImpl) {
		this.loginDaoImpl = loginDaoImpl;
		System.out.println("setLoginDaoImpl");
	}

	@Override
	public String toString() {
		return "LoginService []";
	}

	public LoginServiceImpl() {
		super();
		System.out.println("loginService() constructor");
	}

	public String[] login(String name, String password) {
		System.out.println("loginService login() starts");
		String[] result = loginDaoImpl.login(name, password);
		System.out.println("result : " + result[0]);
		return result;
	}

	@Override
	public void logOut() {
		System.out.println("logOut sevice starts");
		loginDaoImpl.logOut();
		System.out.println("logOut sevice ends");
	}

}
