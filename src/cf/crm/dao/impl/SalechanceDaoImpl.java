package cf.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.SalechanceDao;
import cf.crm.entity.Salechance;

@Component
@Scope("prototype")
public class SalechanceDaoImpl extends DaoAdapter implements SalechanceDao {
	@Override
	public void add(Salechance salechance) {
		salechance.setSachId(super.generateKey());
		super.add(salechance);
	}

	@Override
	public void remove(Salechance salechance) {
		super.remove(salechance);
	}

	@Override
	public void modify(Salechance salechance) {
		super.modify(salechance);
	}

	@Override
	public Salechance find(String id) {
		return (Salechance) super.find(id, Salechance.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Salechance> findList() {
		return (List<Salechance>) super.findList(Salechance.class);
	}

	
}