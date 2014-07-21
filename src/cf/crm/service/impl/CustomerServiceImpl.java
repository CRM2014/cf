package cf.crm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.CustomerDao;
import cf.crm.entity.Customer;
import cf.crm.service.CustomerService;
import cf.crm.util.page.Page;

@Component
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	@Qualifier("customerDaoImpl")
	private CustomerDao customerDao;

	@Override
	public void add(Customer customer) {
		customerDao.add(customer);
	}

	@Override
	public void remove(Customer customer) {
		customerDao.remove(customer);
	}

	@Override
	public void modify(Customer customer) {
		customerDao.modify(customer);
	}

	@Override
	public Customer find(String id) {
		return customerDao.find(id);
	}

	@Override
	public List<Customer> findList() {
		return customerDao.findList();
	}

	@Override
	public void findByPage(Page<Customer> page, Map<String, Object> like) {
		// TODO Auto-generated method stub
		customerDao.findByPage(page, like);
	}

	@Override
	public void findContributionByPage(Page page) {
		customerDao.findContributionByPage(page);
	}

	@Override
	public void findCompositionByPage(Page page){
		customerDao.findCompositionByPage(page);
	}

	@Override
	public void findServiceByPage(Page page){
		customerDao.findServiceByPage(page);
	}

	@Override
	public void findDrainByPage(Page page){
		customerDao.findDrainByPage(page);
	}

}
