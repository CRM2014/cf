package cf.crm.service;

import java.util.List;

import cf.crm.entity.Salechance;

public interface SalechanceService {
	public void add(Salechance salechance);

	public void remove(Salechance salechance);

	public void modify(Salechance salechance);

	public Salechance find(String id);

	public List<Salechance> findList();
	
}
