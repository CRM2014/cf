package cf.crm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.UserDao;
import cf.crm.entity.User;
import cf.crm.service.UserService;
import cf.crm.util.page.Page;

@Component
@Scope("prototype")
public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier("userDaoImpl")
	private UserDao userDao;

	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public void remove(User user) {
		userDao.remove(user);
	}

	@Override
	public void modify(User user) {
		userDao.modify(user);
	}

	@Override
	public User find(String id) {
		return userDao.find(id);
	}

	@Override
	public List<User> findList() {
		return userDao.findList();
	}

	@Override
	public User findByUserName(String userName) {
		return userDao.findByUserName(userName);
	}

	@Override
	public void findByPage(Page<User> page, Map<String, Object> like) {
		userDao.findByPage(page, like);
	}
}
