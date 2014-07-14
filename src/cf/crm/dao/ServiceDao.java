package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Service;

public interface ServiceDao extends Dao {
	public void add(Service Service);

	public void remove(Service Service);

	public void modify(Service Service);

	public Service find(String id);

	public List<Service> findList();
	
}
