package cf.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.CustomerDao;
import cf.crm.entity.Customer;
import cf.crm.service.CustomerService;

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



}
