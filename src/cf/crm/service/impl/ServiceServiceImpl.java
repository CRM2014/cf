package cf.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.ServiceDao;
import cf.crm.entity.Service;
import cf.crm.service.ServiceService;

@Component
@Scope("prototype")
public class ServiceServiceImpl implements ServiceService {
	@Autowired
	@Qualifier("serviceDaoImpl")
	private ServiceDao serviceDao;

	@Override
	public void add(Service service) {
		serviceDao.add(service);
	}

	@Override
	public void remove(Service service) {
		serviceDao.remove(service);
	}

	@Override
	public void modify(Service service) {
		serviceDao.modify(service);
	}

	@Override
	public Service find(String id) {
		return serviceDao.find(id);
	}

	@Override
	public List<Service> findList() {
		return serviceDao.findList();
	}

}
