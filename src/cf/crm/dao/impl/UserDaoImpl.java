package cf.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.UserDao;
import cf.crm.entity.User;

@Component
@Scope("prototype")
public class UserDaoImpl extends DaoAdapter implements UserDao {
	@Override
	public void add(User user) {
		user.setUsId(super.generateKey());
		super.add(user);
	}

	@Override
	public void remove(User user) {
		super.remove(user);
	}

	@Override
	public void modify(User user) {
		super.modify(user);
	}

	@Override
	public User find(String id) {
		return (User) super.find(id, User.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findList() {
		return (List<User>) super.findList(User.class);
	}

	@Override
	public User findByUserName(String userName) {
		try {
			 Criteria cri = getSession().createCriteria(User.class);
			 cri.add(Restrictions.eq("usUserName", userName));
			 return (User) cri.uniqueResult();
		} finally {

		}
	}
}
