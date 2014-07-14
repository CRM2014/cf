package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Development;

public interface DevelopmentDao extends Dao {
	public void add(Development Development);

	public void remove(Development Development);

	public void modify(Development Development);

	public Development find(String id);

	public List<Development> findList();
	
}
