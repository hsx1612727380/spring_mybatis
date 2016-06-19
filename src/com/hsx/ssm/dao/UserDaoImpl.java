package com.hsx.ssm.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hsx.ssm.po.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	
	// ��Ϊ�̳���SqlSessionDaoSupport������Ĵ��벻��Ҫ�ˣ���SqlSessionDaoSupport���и����� public void setSqlSessionFactory(org.apache.ibatis.session.SqlSessionFactory sqlSessionFactory);��ȡsqlSessionFactory
	// ����ͨ��SqlSession sqlSession = this.getSqlSession();���õ�sqlSessionFactory
	/*private SqlSessionFactory sqlSessionFactory;
	
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}*/

	@Override
	public User findUserById(int id) throws Exception {
		SqlSession sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("test.findUserById", id);
		//sqlSession.close(); ��Spring������Դ���ڷ�����������Դ�Զ��ر�
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
