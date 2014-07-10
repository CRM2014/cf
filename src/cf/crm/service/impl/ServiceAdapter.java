package cf.crm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.Dao;
import cf.crm.service.Service;
@Component
@Scope("prototype")
public class ServiceAdapter implements Service {
	@Autowired
	@Qualifier("daoAdapter")
	private Dao dao;

	@Override
	public void save(Object entity) {
		dao.save(entity);
	}

}
