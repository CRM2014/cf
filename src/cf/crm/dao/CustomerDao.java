package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Customer;

public interface CustomerDao extends Dao {
	public void add(Customer Customer);

	public void remove(Customer Customer);

	public void modify(Customer Customer);

	public Customer find(String id);

	public List<Customer> findList();
	
}
