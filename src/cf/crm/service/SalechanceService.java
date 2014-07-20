package cf.crm.service;

import java.util.List;
import java.util.Map;

import cf.crm.entity.Salechance;
import cf.crm.entity.Servicecustomer;
import cf.crm.util.page.Page;

public interface SalechanceService {
	public void add(Salechance salechance);

	public void remove(Salechance salechance);

	public void modify(Salechance salechance);

	public Salechance find(String id);

	public List<Salechance> findList();
	
	public void findByPage(Page<Salechance> page, Map<String, Object> like);
	
}
