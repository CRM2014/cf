package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Outflow;

public interface OutflowDao extends Dao {
	public void add(Outflow outflow);

	public void remove(Outflow outflow);

	public void modify(Outflow outflow);

	public Outflow find(String id);

	public List<Outflow> findList();
	
}
