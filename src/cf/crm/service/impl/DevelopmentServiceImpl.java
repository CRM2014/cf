package cf.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.DevelopmentDao;
import cf.crm.entity.Development;
import cf.crm.service.DevelopmentService;

@Component
@Scope("prototype")
public class DevelopmentServiceImpl implements DevelopmentService {
	@Autowired
	@Qualifier("developmentDaoImpl")
	private DevelopmentDao developmentDao;

	@Override
	public void add(Development development) {
		developmentDao.add(development);
	}

	@Override
	public void remove(Development development) {
		developmentDao.remove(development);
	}

	@Override
	public void modify(Development development) {
		developmentDao.modify(development);
	}

	@Override
	public Development find(String id) {
		return developmentDao.find(id);
	}

	@Override
	public List<Development> findList() {
		return developmentDao.findList();
	}



}
