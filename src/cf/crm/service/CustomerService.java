package cf.crm.service;

import java.util.List;
import java.util.Map;

import cf.crm.entity.Customer;
import cf.crm.entity.User;
import cf.crm.util.page.Page;

public interface CustomerService {
	public void add(Customer customer);

	public void remove(Customer customer);

	public void modify(Customer customer);

	public Customer find(String id);

	public List<Customer> findList();

	public void findByPage(Page<Customer> page, Map<String, Object> like);

}
