package com.chance.crud.test;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSqlSessionFactory {

	
	public static void main(String[] args) {
		
		
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

		SqlSessionFactory ssq =	(SqlSessionFactory) app.getBean("sqlSessionFactory");
			
		System.out.println(ssq);
	
	}
	
}
