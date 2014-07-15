package cf.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.OutflowDao;
import cf.crm.entity.Outflow;

@Component
@Scope("prototype")
public class OutflowDaoImpl extends DaoAdapter implements OutflowDao {
	@Override
	public void add(Outflow outflow) {
		outflow.setOuflId(super.generateKey());
		super.add(outflow);
	}

	@Override
	public void remove(Outflow outflow) {
		super.remove(outflow);
	}

	@Override
	public void modify(Outflow outflow) {
		super.modify(outflow);
	}

	@Override
	public Outflow find(String id) {
		return (Outflow) super.find(id, Outflow.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Outflow> findList() {
		return (List<Outflow>) super.findList(Outflow.class);
	}

	
}
