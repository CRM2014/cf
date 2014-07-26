/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.UserDao;
import cf.crm.entity.User;
import cf.crm.util.Info.Role;
import cf.crm.util.page.Page;

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
			List<?> list = cri.list();
			if (list.size() == 1)
				return (User) list.get(0);
			else
				return null;
		} finally {
		}
	}

	@Override
	public void findByPage(Page<User> page, Map<String, Object> like) {
		super.findByPage(User.class, page, like);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findListByRole(String role) {
		return (List<User>) super.findListByField(User.class, "usRole", role,
				null);
	}

	@Override
	public void findByPageIncludeSystem(Page<User> page,
			Map<String, Object> like) {
		List<Criterion> criterion = new ArrayList<Criterion>();
		criterion.add(Restrictions.ne("usRole", Role.ROOT));
		super.findByPage(User.class, page, like, criterion);
	}

	@Override
	public void findByPageNoSystem(Page<User> page, Map<String, Object> like) {
		List<Criterion> criterion = new ArrayList<Criterion>();
		criterion.add(Restrictions.ne("usRole", Role.ROOT));
		criterion.add(Restrictions.ne("usRole", Role.SYSTEM));
		super.findByPage(User.class, page, like, criterion);
	}
}
