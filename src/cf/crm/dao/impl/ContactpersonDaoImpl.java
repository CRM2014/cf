package cf.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.ContactpersonDao;
import cf.crm.entity.Contactperson;

@Component
@Scope("prototype")
public class ContactpersonDaoImpl extends DaoAdapter implements ContactpersonDao {
	@Override
	public void add(Contactperson contactperson) {
		contactperson.setCopeId(super.generateKey());
		super.add(contactperson);
	}

	@Override
	public void remove(Contactperson contactperson) {
		super.remove(contactperson);
	}

	@Override
	public void modify(Contactperson contactperson) {
		super.modify(contactperson);
	}

	@Override
	public Contactperson find(String id) {
		return (Contactperson) super.find(id, Contactperson.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contactperson> findList() {
		return (List<Contactperson>) super.findList(Contactperson.class);
	}

	
}
