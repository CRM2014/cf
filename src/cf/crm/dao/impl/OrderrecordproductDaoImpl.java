package cf.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.OrderrecordproductDao;
import cf.crm.entity.Orderrecordproduct;

@Component
@Scope("prototype")
public class OrderrecordproductDaoImpl extends DaoAdapter implements OrderrecordproductDao {
	@Override
	public void add(Orderrecordproduct orderrecordproduct) {
		orderrecordproduct.setOrreprId(super.generateKey());
		super.add(orderrecordproduct);
	}

	@Override
	public void remove(Orderrecordproduct orderrecordproduct) {
		super.remove(orderrecordproduct);
	}

	@Override
	public void modify(Orderrecordproduct orderrecordproduct) {
		super.modify(orderrecordproduct);
	}

	@Override
	public Orderrecordproduct find(String id) {
		return (Orderrecordproduct) super.find(id, Orderrecordproduct.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Orderrecordproduct> findList() {
		return (List<Orderrecordproduct>) super.findList(Orderrecordproduct.class);
	}

	
}
