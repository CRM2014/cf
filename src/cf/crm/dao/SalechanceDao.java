package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Salechance;

public interface SalechanceDao extends Dao {
	public void add(Salechance Salechance);

	public void remove(Salechance Salechance);

	public void modify(Salechance Salechance);

	public Salechance find(String id);

	public List<Salechance> findList();
	
}
