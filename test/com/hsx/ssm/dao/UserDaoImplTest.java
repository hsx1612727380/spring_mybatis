package com.hsx.ssm.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsx.ssm.dao.UserDao;
import com.hsx.ssm.po.User;

public class UserDaoImplTest {
	
	private ApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	}
	
	@Test
	public void testFindUserById() throws Exception {
		UserDao userDao = (UserDao) context.getBean("userDao");
		User user = userDao.findUserById(1);
		System.out.println(user);
	}

}
