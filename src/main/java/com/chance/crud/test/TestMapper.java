package com.chance.crud.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chance.crud.bean.User;
import com.chance.crud.dao.UserMapper;

@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMapper {
	@Autowired
	UserMapper userMapper;
	
	//@Test
	public void addUser() {
		
		User user = new User();
		user.setName("张翠山");
		user.setAge(40);
		userMapper.addUser(user);
	
	}
	//@Test
	public void deleteUserById() {
		userMapper.delteUserById(10);
		System.out.println("Ok");
	}
	//@Test
	public void selectUserById() {
		
	User user=	userMapper.findUserById(9);
		System.out.println(user.getName()+user.getAge());
		
	}
	@Test
	public void updateUserById() {
		userMapper.updateUserById("狗子", 2);
	}
}
