package com.chance.crud.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.chance.crud.bean.User;
import com.github.pagehelper.PageInfo;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"classpath:applicationContext.xml","classpath:spring-mvc.xml"})
public class SpringMvcTest {
	@Autowired
	WebApplicationContext context;
	MockMvc mockMvc;
	@Before
	public void initMockMvc() {
	mockMvc = 	MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void testPage() throws Exception {
		
		
	MvcResult result= 	mockMvc.perform(MockMvcRequestBuilders.get("/users").param("pageNum", "1")).andReturn();
	MockHttpServletRequest request=result.getRequest();	
PageInfo pa =	 (PageInfo) request.getAttribute("pageInfo");
	System.err.println("pa.getEndRow()"+pa.getEndRow());
	System.out.println("firstPage"+pa.getFirstPage());
	System.out.println(pa.getLastPage()+"lastPage");

int[] nums=	pa.getNavigatepageNums();
		for (int i : nums) {
			System.out.println(i);
		}
	List<User> userInfo =	pa.getList();
			for (User user : userInfo) {
				System.out.println(user.getName()+user.getAge());
			}
		}
	}
