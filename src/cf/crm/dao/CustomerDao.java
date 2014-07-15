package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Customer;

public interface CustomerDao extends Dao {
	public void add(Customer customer);

	public void remove(Customer customer);

	public void modify(Customer customer);

	public Customer find(String id);

	public List<Customer> findList();
	
}
