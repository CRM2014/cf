package cf.crm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cf.crm.dao.Dao;
import cf.crm.service.Service;

public class ServiceAdapter implements Service {
	@Autowired
	@Qualifier("daoAdapter")
	private Dao dao;

	@Override
	public void save(Object entity) {
		dao.save(entity);
	}

	@Override
	public Object get(String id, Class<?> clazz) {
		return dao.get(id, clazz);
	}
}
