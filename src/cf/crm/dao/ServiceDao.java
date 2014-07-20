package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Service;

public interface ServiceDao extends Dao {
	public void add(Service service);

	public void remove(Service service);

	public void modify(Service service);

	public Service find(String id);

	public List<Service> findList();
	
}
