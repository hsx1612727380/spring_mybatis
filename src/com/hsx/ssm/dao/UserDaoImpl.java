package com.hsx.ssm.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hsx.ssm.po.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	
	// 因为继承了SqlSessionDaoSupport，下面的代码不需要了，在SqlSessionDaoSupport中有个方法 public void setSqlSessionFactory(org.apache.ibatis.session.SqlSessionFactory sqlSessionFactory);获取sqlSessionFactory
	// 现在通过SqlSession sqlSession = this.getSqlSession();来得到sqlSessionFactory
	/*private SqlSessionFactory sqlSessionFactory;
	
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}*/

	@Override
	public User findUserById(int id) throws Exception {
		SqlSession sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("test.findUserById", id);
		//sqlSession.close(); 让Spring管理资源，在方法结束后，资源自动关闭
		return user;
	}

	@Override
	public User findUserByUsername(String username) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertUser(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	
}
