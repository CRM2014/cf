package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Development;

public interface DevelopmentDao extends Dao {
	public void add(Development development);

	public void remove(Development development);

	public void modify(Development development);

	public Development find(String id);

	public List<Development> findList();
	
}
