package cf.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.ContactrecordDao;
import cf.crm.entity.Contactrecord;
import cf.crm.service.ContactrecordService;

@Component
@Scope("prototype")
public class ContactrecordServiceImpl implements ContactrecordService {
	@Autowired
	@Qualifier("contactrecordDaoImpl")
	private ContactrecordDao contactrecordDao;

	@Override
	public void add(Contactrecord contactrecord) {
		contactrecordDao.add(contactrecord);
	}

	@Override
	public void remove(Contactrecord contactrecord) {
		contactrecordDao.remove(contactrecord);
	}

	@Override
	public void modify(Contactrecord contactrecord) {
		contactrecordDao.modify(contactrecord);
	}

	@Override
	public Contactrecord find(String id) {
		return contactrecordDao.find(id);
	}

	@Override
	public List<Contactrecord> findList() {
		return contactrecordDao.findList();
	}



}
