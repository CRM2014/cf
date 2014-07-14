package cf.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.ContactrecordDao;
import cf.crm.entity.Contactrecord;

@Component
@Scope("prototype")
public class ContactrecordDaoImpl extends DaoAdapter implements ContactrecordDao {
	@Override
	public void add(Contactrecord contactrecord) {
		contactrecord.setCoreId(super.generateKey());
		super.add(contactrecord);
	}

	@Override
	public void remove(Contactrecord contactrecord) {
		super.remove(contactrecord);
	}

	@Override
	public void modify(Contactrecord contactrecord) {
		super.modify(contactrecord);
	}

	@Override
	public Contactrecord find(String id) {
		return (Contactrecord) super.find(id, Contactrecord.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contactrecord> findList() {
		return (List<Contactrecord>) super.findList(Contactrecord.class);
	}

	
}
