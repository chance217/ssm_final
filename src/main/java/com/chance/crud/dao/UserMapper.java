package com.chance.crud.dao;

import java.util.List;

import com.chance.crud.bean.User;

public interface UserMapper {
	
	public User findUserById(Integer id); 
	
	public void addUser(User user);
	
	public void delteUserById(Integer id);
	
	public void updateUserById(String name,Integer id);
	
	public List<User> findUsers();

}
