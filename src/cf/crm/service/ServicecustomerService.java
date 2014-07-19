package cf.crm.service;

import java.util.List;
import java.util.Map;

import cf.crm.entity.Service;
import cf.crm.entity.Servicecustomer;
import cf.crm.util.page.Page;

public interface ServicecustomerService {
	public void add(Servicecustomer servicecustomer);

	public void remove(Servicecustomer servicecustomer);

	public void modify(Servicecustomer servicecustomer);

	public Servicecustomer find(String id);

	public List<Servicecustomer> findList();
	
	public void findByPage(Page<Servicecustomer> page, Map<String, Object> like);
	
}
