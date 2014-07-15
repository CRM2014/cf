package cf.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.OrderrecordDao;
import cf.crm.entity.Orderrecord;
import cf.crm.service.OrderrecordService;

@Component
@Scope("prototype")
public class OrderrecordServiceImpl implements OrderrecordService {
	@Autowired
	@Qualifier("orderrecordDaoImpl")
	private OrderrecordDao orderrecordDao;

	@Override
	public void add(Orderrecord orderrecord) {
		orderrecordDao.add(orderrecord);
	}

	@Override
	public void remove(Orderrecord orderrecord) {
		orderrecordDao.remove(orderrecord);
	}

	@Override
	public void modify(Orderrecord orderrecord) {
		orderrecordDao.modify(orderrecord);
	}

	@Override
	public Orderrecord find(String id) {
		return orderrecordDao.find(id);
	}

	@Override
	public List<Orderrecord> findList() {
		return orderrecordDao.findList();
	}



}
