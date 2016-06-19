package com.hsx.ssm.mapper;

import java.util.List;

import com.hsx.ssm.po.User;
import com.hsx.ssm.po.UserCustom;
import com.hsx.ssm.po.UserQueryVo;

/**
 * mapper接口，相当于dao接口
 * @author hsx
 *
 */
public interface UserMapper {
	
	/**
	 * 用户信息的综合查�?
	 * @param userQueryVo
	 * @return
	 * @throws Exception
	 */
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
	
	/**
	 * 用户信息的综合查询�?�数
	 * @param userQueryVo
	 * @return
	 * @throws Exception
	 */
	public int findUserCount(UserQueryVo userQueryVo) throws Exception; 
	
	/**
	 * 根据用户的Id查询用户[用resultMap进行输出映射]
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User findUserByIdResultMap(int id) throws Exception; 
	
	/**
	 * 根据用户的id查询用户
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User findUserById(int id) throws Exception;
	
	/**
	 * 根据用户名查询用�?
	 * @param username
	 * @return
	 * @throws Exception
	 */
	public List<User> findUserByUsername(String username) throws Exception;
	
	/**
	 * 添加用户
	 * @param user
	 * @throws Exception
	 */
	public void insertUser(User user) throws Exception;
	
	/**
	 * 根据用户的id删除用户
	 * @param id
	 * @throws Exception
	 */
	public void deleteUserById(int id) throws Exception;
	
	/**
	 * 根据用户的id更新用户
	 * @param user
	 * @throws Exception
	 */
	public void updateUser(User user) throws Exception;

}
