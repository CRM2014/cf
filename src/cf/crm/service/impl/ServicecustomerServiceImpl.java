package cf.crm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.ServicecustomerDao;
import cf.crm.entity.Servicecustomer;
import cf.crm.entity.User;
import cf.crm.service.ServicecustomerService;
import cf.crm.util.page.Page;

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

	@Override
	public void findByPage(Page<Servicecustomer> page, Map<String, Object> like) {
		servicecustomerDao.findByPage(page, like);
	}

	@Override
	public void findByPage(Page<Servicecustomer> page, Map<String, Object> eq,
			Map<String, Object> not, Map<String, Object> like,
			List<String> empty) {
		servicecustomerDao.findByPage(Servicecustomer.class, page, eq, not,
				like, empty);
	}

	@Override
	public void findAssignByPage(Page<Servicecustomer> page,
			Map<String, Object> like) {
		servicecustomerDao.findAssignByPage(page, like);
	}

	@Override
	public void findDealByPage(Page<Servicecustomer> page,
			Map<String, Object> like) {
		servicecustomerDao.findDealByPage(page, like);
	}

	@Override
	public void findFeedbackByPage(Page<Servicecustomer> page,
			Map<String, Object> like) {
		servicecustomerDao.findFeedbackByPage(page, like);
	}

	@Override
	public void findArchiveByPage(Page<Servicecustomer> page,
			Map<String, Object> like) {
		servicecustomerDao.findArchiveByPage(page, like);
	}

}
