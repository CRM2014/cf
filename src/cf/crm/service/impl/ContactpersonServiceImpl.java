package cf.crm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.ContactpersonDao;
import cf.crm.entity.Contactperson;
import cf.crm.service.ContactpersonService;
import cf.crm.util.page.Page;

@Component
@Scope("prototype")
public class ContactpersonServiceImpl implements ContactpersonService {
	@Autowired
	@Qualifier("contactpersonDaoImpl")
	private ContactpersonDao contactpersonDao;

	@Override
	public void add(Contactperson contactperson) {
		contactpersonDao.add(contactperson);
	}

	@Override
	public void remove(Contactperson contactperson) {
		contactpersonDao.remove(contactperson);
	}

	@Override
	public void modify(Contactperson contactperson) {
		contactpersonDao.modify(contactperson);
	}

	@Override
	public Contactperson find(String id) {
		return contactpersonDao.find(id);
	}

	@Override
	public List<Contactperson> findList() {
		return contactpersonDao.findList();
	}

	@Override
	public void findByPage(Page<Contactperson> page, Map<String, Object> like) {
		// TODO Auto-generated method stub
		contactpersonDao.findByPage(page, like);
	}

}
