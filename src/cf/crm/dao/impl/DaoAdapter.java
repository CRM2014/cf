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

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import cf.crm.dao.Dao;
import cf.crm.util.page.Page;

@Component
@Scope("prototype")
public class DaoAdapter extends HibernateDaoSupport implements Dao {

	public String generateKey() {
		return generateKey(10);
	}

	public String generateKey(int length) {
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
		findByPage(clazz, page, like, null);
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
	public List<?> findListByField(Class<?> clazz, String name, Object value,
			Order order) {
		try {
			Criteria cri = getSession().createCriteria(clazz);
			cri.add(Restrictions.eq(name, value));
			return cri.list();
		} finally {
		}
	}

	@Override
	public List<?> findLikeListByField(Class<?> clazz, String name, Object value) {
		try {
			Criteria cri = getSession().createCriteria(clazz);
			cri.addOrder(Order.desc(name));
			cri.add(Restrictions.like(name, value.toString(),
					MatchMode.ANYWHERE));
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
					cri.add(Restrictions.like(entry.getKey(), entry.getValue()));
				}
			}
			return cri.list();
		} finally {
		}
	}

	@Override
	public void findByPage(Class<?> clazz, Page<?> page,
			Map<String, Object> like, List<Criterion> criterion) {
		try {
			Criteria cri = getSession().createCriteria(clazz);
			if (like != null) {
				for (Entry<String, Object> entry : like.entrySet()) {
					String arr[] = entry.getKey().split("\\.");
					if (arr.length == 2) {
						try {
							String first = arr[0].substring(0, 1).toUpperCase();
							String rest = arr[0].substring(1, arr[0].length());
							String newStr = new StringBuffer("cf.crm.entity."
									+ first).append(rest).toString();
							List l = findLikeListByField(Class.forName(newStr),
									arr[1], entry.getValue());
							if (l != null && l.size() != 0)
								cri.add(Restrictions.in(arr[0], l));
							else
								return;
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						}
						like.remove(entry.getKey());
					}

				}
				for (Entry<String, Object> entry : like.entrySet()) {
					if (entry.getValue() instanceof String)
						cri.add(Restrictions.like(entry.getKey(), entry
								.getValue().toString(), MatchMode.ANYWHERE));
					else
						cri.add(Restrictions.like(entry.getKey(),
								entry.getValue()));
				}
			}
			if (criterion != null) {
				for (Criterion c : criterion)
					cri.add(c);
			}
			if (page.getOrder() != null && !"".equals(page.getOrder())) {
				if (page.isDesc())
					cri.addOrder(Order.desc(page.getOrder()));
				else {
					cri.addOrder(Order.asc(page.getOrder()));
				}
			}

			String hql = "select count(*) from " + clazz.getSimpleName();
			Query query = getSession().createQuery(hql);
			int count = ((Long) query.uniqueResult()).intValue();
			cri.setFirstResult(page.getFirstRec());
			if (page.getPageSize() != 0)
				cri.setMaxResults(page.getPageSize());
			page.setCount(count);
			page.setList(cri.list());
		} finally {
		}
	}

	@Override
	public void findByPage(Page page, String sql) {
		page.setList(getSession().createSQLQuery(sql).list());
	}

	@Override
	public void add(List<?> entities) {
		for (Object entity : entities) {
			try {
				getSession().save(entity);
			} finally {
			}
		}
	}
}
