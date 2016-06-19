package com.hsx.ssm.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsx.ssm.po.User;

public class UserMapperTest {
	
	private ApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	}
	
	@Test
	public void testFindUserById() throws Exception {
		UserMapper mapper = (UserMapper) context.getBean("userMapper");
		User user = mapper.findUserById(1);
		System.out.println(user);
	}

}
