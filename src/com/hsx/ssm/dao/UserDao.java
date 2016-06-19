package com.hsx.ssm.dao;

import com.hsx.ssm.po.User;

public interface UserDao {
	
	public User findUserById(int id) throws Exception;
	
	public User findUserByUsername(String username) throws Exception;
	
	public void insertUser(User user) throws Exception;
	
	public void deleteUserById(int id) throws Exception;
	
	public void updateUserById(int id) throws Exception;

}
