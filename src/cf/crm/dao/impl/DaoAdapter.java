/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>dao原有方法类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */
package cf.crm.dao.impl;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cf.crm.dao.Dao;
import cf.crm.util.page.Page;

public class DaoAdapter extends HibernateDaoSupport implements Dao {

	public String generateKey() {
		int length = 10;
		String base = "0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}

	@Override
	public void add(Object entity) {
		try {
			getSession().save(entity);
		} finally {
		}
	}

	@Override
	public void remove(Object entity) {
		try {
			getSession().delete(entity);
		} finally {
		}
	}

	@Override
	public Object find(String id, Class<?> clazz) {
		try {
			return getSession().get(clazz, id);
		} finally {
		}
	}

	@Override
	public void modify(Object entity) {
		try {
			getSession().update(entity);
		} finally {
		}
	}

	@Override
	public List<?> findList(Class<?> clazz) {
		try {
			Criteria cri = getSession().createCriteria(clazz);
			return cri.list();
		} finally {
		}
	}

	@Override
	public void findByPage(Class<?> clazz, Page<?> page,
			Map<String, Object> like) {
		findByPage(clazz, page, null, like);
	}

	@Override
	public Object findByField(Class<?> clazz, String name, Object value) {
		try {
			Criteria cri = getSession().createCriteria(clazz);
			cri.add(Restrictions.eq(name, value));
			return cri.uniqueResult();
		} finally {
		}
	}

	@Override
	public List<?> findListByField(Class<?> clazz, String name, Object value) {
		try {
			Criteria cri = getSession().createCriteria(clazz);
			cri.add(Restrictions.eq(name, value));
			return cri.list();
		} finally {
		}
	}

	@Override
	public List<?> findList(Class<?> clazz, Map<String, Object> eq,
			Map<String, Object> like) {
		try {
			Criteria cri = getSession().createCriteria(clazz);
			if (eq != null)
				cri.add(Restrictions.allEq(eq));
			if (like != null) {
				for (Entry<String, Object> entry : like.entrySet()) {
					cri.add(Restrictions.like(entry.getKey(), "%"
							+ entry.getValue().toString() + "%"));
				}
			}
			return cri.list();
		} finally {
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void findByPage(Class<?> clazz, Page<?> page,
			Map<String, Object> eq, Map<String, Object> like) {
		try {

			Criteria cri = getSession().createCriteria(clazz);
			if (eq != null)
				cri.add(Restrictions.allEq(eq));
			if (like != null) {
				for (Entry<String, Object> entry : like.entrySet()) {
					cri.add(Restrictions.like(entry.getKey(), "%"
							+ entry.getValue().toString() + "%"));
				}
			}
			if (page.getOrder() != null && !"".equals(page.getOrder())) {
				if (page.isDesc())
					cri.addOrder(Order.desc(page.getOrder()));
				else {
					cri.addOrder(Order.asc(page.getOrder()));
				}
			}
			int count = cri.list().size();
			cri.setFirstResult(page.getFirstRec());
			cri.setMaxResults(page.getPageSize());
			page.setCount(count);
			page.setList(cri.list());
		} finally {
		}
	}
}
