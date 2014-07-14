package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Servicecustomer;

public interface ServicecustomerDao extends Dao {
	public void add(Servicecustomer Servicecustomer);

	public void remove(Servicecustomer Servicecustomer);

	public void modify(Servicecustomer Servicecustomer);

	public Servicecustomer find(String id);

	public List<Servicecustomer> findList();
	
}
