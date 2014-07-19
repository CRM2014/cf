package cf.crm.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.ServicecustomerDao;
import cf.crm.entity.Service;
import cf.crm.entity.Servicecustomer;
import cf.crm.util.page.Page;

@Component
@Scope("prototype")
public class ServicecustomerDaoImpl extends DaoAdapter implements ServicecustomerDao {
	@Override
	public void add(Servicecustomer servicecustomer) {
		servicecustomer.setSecuId(super.generateKey());
		super.add(servicecustomer);
	}

	@Override
	public void remove(Servicecustomer servicecustomer) {
		super.remove(servicecustomer);
	}

	@Override
	public void modify(Servicecustomer servicecustomer) {
		super.modify(servicecustomer);
	}

	@Override
	public Servicecustomer find(String id) {
		return (Servicecustomer) super.find(id, Servicecustomer.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Servicecustomer> findList() {
		return (List<Servicecustomer>) super.findList(Servicecustomer.class);
	}

	@Override
	public void findByPage(Page<Servicecustomer> page, Map<String, Object> like) {
		super.findByPage(Servicecustomer.class, page, like);
	}
	
}
