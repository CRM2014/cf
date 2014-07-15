package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Servicecustomer;

public interface ServicecustomerDao extends Dao {
	public void add(Servicecustomer servicecustomer);

	public void remove(Servicecustomer servicecustomer);

	public void modify(Servicecustomer servicecustomer);

	public Servicecustomer find(String id);

	public List<Servicecustomer> findList();
	
}
