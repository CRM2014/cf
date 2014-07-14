package cf.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.SalechanceDao;
import cf.crm.entity.Salechance;
import cf.crm.service.SalechanceService;

@Component
@Scope("prototype")
public class SalechanceServiceImpl implements SalechanceService {
	@Autowired
	@Qualifier("salechanceDaoImpl")
	private SalechanceDao salechanceDao;

	@Override
	public void add(Salechance salechance) {
		salechanceDao.add(salechance);
	}

	@Override
	public void remove(Salechance salechance) {
		salechanceDao.remove(salechance);
	}

	@Override
	public void modify(Salechance salechance) {
		salechanceDao.modify(salechance);
	}

	@Override
	public Salechance find(String id) {
		return salechanceDao.find(id);
	}

	@Override
	public List<Salechance> findList() {
		return salechanceDao.findList();
	}



}
