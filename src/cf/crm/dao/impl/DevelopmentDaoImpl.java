package cf.crm.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.DevelopmentDao;
import cf.crm.entity.Development;
import cf.crm.entity.Servicecustomer;
import cf.crm.util.page.Page;

@Component
@Scope("prototype")
public class DevelopmentDaoImpl extends DaoAdapter implements DevelopmentDao {
	@Override
	public void add(Development development) {
		development.setDeId(super.generateKey());
		super.add(development);
	}

	@Override
	public void remove(Development development) {
		super.remove(development);
	}

	@Override
	public void modify(Development development) {
		super.modify(development);
	}

	@Override
	public Development find(String id) {
		return (Development) super.find(id, Development.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Development> findList() {
		return (List<Development>) super.findList(Development.class);
	}

	@Override
	public void findByPage(Page<Development> page, Map<String, Object> like) {
		super.findByPage(Development.class, page, like);
	}
}
