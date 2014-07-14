package cf.crm.dao.impl;

import java.util.List;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cf.crm.dao.Dao;

public abstract class DaoAdapter implements Dao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public String generateKey() {
		int length = 10;
		String base = "abcdefghijklmnopqrstuvwxyz0123456789";
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

}
