package cf.crm.dao;

import java.util.List;
import java.util.Map;

import cf.crm.entity.User;
import cf.crm.util.page.Page;

public interface UserDao extends Dao {
	public void add(User user);

	public void remove(User user);

	public void modify(User user);

	public User find(String id);

	public List<User> findList();

	public User findByUserName(String userName);

	public void findByPage(Page<User> page, Map<String, Object> like);

	public List<User> findListByRole(String role);

	public void findByPageIncludeSystem(Page<User> page,
			Map<String, Object> like);

	public void findByPageNoSystem(Page<User> page, Map<String, Object> like);
}
