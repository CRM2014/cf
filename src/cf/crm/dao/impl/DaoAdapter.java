package cf.crm.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.Dao;

@Component
@Scope("prototype")
public class DaoAdapter implements Dao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(Object entity) {
		try {
			getSession().save(entity);
		} finally {
		}
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object get(String id, Class<?> clazz) {
		try {
			return getSession().get(clazz, id);
		} finally {
		}
	}

	@Override
	public void getli() {
		// TODO Auto-generated method stub
	}

}
