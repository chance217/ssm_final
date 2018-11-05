package com.chance.crud.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDataSource {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
				
	DataSource dataSource	=	(DataSource) app.getBean("dataSource");
			
		System.out.println(dataSource.getConnection());
	}
	
}
