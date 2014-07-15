package cf.crm.service;

import java.util.List;

import cf.crm.entity.Customer;

public interface CustomerService {
	public void add(Customer customer);

	public void remove(Customer customer);

	public void modify(Customer customer);

	public Customer find(String id);

	public List<Customer> findList();
	
}
