package com.shingu.dao;

public interface LoginDao {
	public String[] login(String name, String password);
	public void logOut();
}
