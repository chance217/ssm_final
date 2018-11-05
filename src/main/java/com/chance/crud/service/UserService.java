package com.chance.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chance.crud.bean.User;
import com.chance.crud.dao.UserMapper;
@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	
	public List<User> getAllUser() {
		
		 return 	userMapper.findUsers();

	}

	
}
