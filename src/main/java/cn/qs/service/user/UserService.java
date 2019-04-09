package cn.qs.service.user;

import java.util.List;
import java.util.Map;

import cn.qs.bean.user.User;

public interface UserService {

	/**
	 * 根据接口查询所用的用户
	 */
	public List<User> findAllUser();
	
	public User findUserByUsername(String username);

	public void addUser(User user);

	public List<User> getUsers(Map condition);

	public void deleteUser(int id);

	public User getUser(int id);

	public void updateUser(User user);

	public User getUserByUserNameAndPassword(String username, String password);
}
