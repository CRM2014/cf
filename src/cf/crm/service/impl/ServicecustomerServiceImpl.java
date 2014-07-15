package cf.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.ServicecustomerDao;
import cf.crm.entity.Servicecustomer;
import cf.crm.service.ServicecustomerService;

@Component
@Scope("prototype")
public class ServicecustomerServiceImpl implements ServicecustomerService {
	@Autowired
	@Qualifier("servicecustomerDaoImpl")
	private ServicecustomerDao servicecustomerDao;

	@Override
	public void add(Servicecustomer servicecustomer) {
		servicecustomerDao.add(servicecustomer);
	}

	@Override
	public void remove(Servicecustomer servicecustomer) {
		servicecustomerDao.remove(servicecustomer);
	}

	@Override
	public void modify(Servicecustomer servicecustomer) {
		servicecustomerDao.modify(servicecustomer);
	}

	@Override
	public Servicecustomer find(String id) {
		return servicecustomerDao.find(id);
	}

	@Override
	public List<Servicecustomer> findList() {
		return servicecustomerDao.findList();
	}



}
