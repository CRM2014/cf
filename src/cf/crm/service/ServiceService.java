package cf.crm.service;

import java.util.List;
import java.util.Map;

import cf.crm.entity.Service;
import cf.crm.entity.User;
import cf.crm.util.page.Page;

public interface ServiceService {
	public void add(Service service);
	
	public void remove(Service service);

	public void modify(Service service);

	public Service find(String id);

	public List<Service> findList();
	
}
