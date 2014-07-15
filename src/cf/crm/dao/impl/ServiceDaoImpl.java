package cf.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.ServiceDao;
import cf.crm.entity.Service;

@Component
@Scope("prototype")
public class ServiceDaoImpl extends DaoAdapter implements ServiceDao {
	@Override
	public void add(Service service) {
		service.setSeId(super.generateKey());
		super.add(service);
	}

	@Override
	public void remove(Service service) {
		super.remove(service);
	}

	@Override
	public void modify(Service service) {
		super.modify(service);
	}

	@Override
	public Service find(String id) {
		return (Service) super.find(id, Service.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Service> findList() {
		return (List<Service>) super.findList(Service.class);
	}

	
}
