package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Outflow;

public interface OutflowDao extends Dao {
	public void add(Outflow Outflow);

	public void remove(Outflow Outflow);

	public void modify(Outflow Outflow);

	public Outflow find(String id);

	public List<Outflow> findList();
	
}
