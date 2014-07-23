package cf.crm.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.ServicecustomerDao;
import cf.crm.entity.Servicecustomer;
import cf.crm.util.page.Page;

@Component
@Scope("prototype")
public class ServicecustomerDaoImpl extends DaoAdapter implements
		ServicecustomerDao {
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

	@Override
	public void findFeedbackByPage(Page<Servicecustomer> page,
			Map<String, Object> like) {
		List<Criterion> cri = new ArrayList<Criterion>();
		cri.add(Restrictions.isNull("secuDealResult"));
		cri.add(Restrictions.isNotNull("secuDeal"));
		super.findByPage(Servicecustomer.class, page, like, cri);
	}

	@Override
	public void findArchiveByPage(Page<Servicecustomer> page,
			Map<String, Object> like) {
		List<Criterion> cri = new ArrayList<Criterion>();
		cri.add(Restrictions.isNotNull("secuDealResult"));
		cri.add(Restrictions.isNotNull("secuDeal"));
		super.findByPage(Servicecustomer.class, page, like, cri);
	}

	@Override
	public void findAssignByPage(Page<Servicecustomer> page,
			Map<String, Object> like) {
		List<Criterion> cri = new ArrayList<Criterion>();

		cri.add(Restrictions.isNull("userByUsDealId"));
		super.findByPage(Servicecustomer.class, page, like, cri);
	}

	@Override
	public void findDealByPage(Page<Servicecustomer> page,
			Map<String, Object> like) {
		List<Criterion> cri = new ArrayList<Criterion>();
		cri.add(Restrictions.isNull("secuDeal"));
		cri.add(Restrictions.isNotNull("userByUsDealId"));
		super.findByPage(Servicecustomer.class, page, like, cri);
	}

}
