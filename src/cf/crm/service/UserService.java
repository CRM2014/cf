package cf.crm.service;

import java.util.List;

import cf.crm.entity.User;

public interface UserService {

	public void add(User user);

	public void remove(User user);

	public void modify(User user);

	public User find(String id);

	public List<User> findList();

	public User findByUserName(String userName);
}
