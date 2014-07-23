package cf.crm.dao;

import java.util.List;
import java.util.Map;

import cf.crm.entity.Customer;
import cf.crm.util.page.Page;

public interface CustomerDao extends Dao {
	public void add(Customer customer);

	public void remove(Customer customer);

	public void modify(Customer customer);

	public Customer find(String id);

	public List<Customer> findList();

	public void findByPage(Page<Customer> page, Map<String, Object> like);

	public void findContributionByPage(Page page);

	public void findCompositionByPage(Page page);

	public void findServiceByPage(Page page);

	public void findDrainByPage(Page page);

	public Object getOrderNumber();

	public List<Object> getCustomerNumber();
}
