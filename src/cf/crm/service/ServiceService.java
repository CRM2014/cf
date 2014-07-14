package cf.crm.service;

import java.util.List;

import cf.crm.entity.Service;

public interface ServiceService {
	public void add(Service service);

	public void remove(Service service);

	public void modify(Service service);

	public Service find(String id);

	public List<Service> findList();
	
}
