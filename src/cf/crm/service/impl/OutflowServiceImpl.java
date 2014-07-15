package cf.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.OutflowDao;
import cf.crm.entity.Outflow;
import cf.crm.service.OutflowService;

@Component
@Scope("prototype")
public class OutflowServiceImpl implements OutflowService {
	@Autowired
	@Qualifier("outflowDaoImpl")
	private OutflowDao outflowDao;

	@Override
	public void add(Outflow outflow) {
		outflowDao.add(outflow);
	}

	@Override
	public void remove(Outflow outflow) {
		outflowDao.remove(outflow);
	}

	@Override
	public void modify(Outflow outflow) {
		outflowDao.modify(outflow);
	}

	@Override
	public Outflow find(String id) {
		return outflowDao.find(id);
	}

	@Override
	public List<Outflow> findList() {
		return outflowDao.findList();
	}

	
}
