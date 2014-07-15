package cf.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.CustomerDao;
import cf.crm.entity.Customer;

@Component
@Scope("prototype")
public class CustomerDaoImpl extends DaoAdapter implements CustomerDao {
	@Override
	public void add(Customer customer) {
		customer.setCuId(super.generateKey());
		super.add(customer);
	}

	@Override
	public void remove(Customer customer) {
		super.remove(customer);
	}

	@Override
	public void modify(Customer customer) {
		super.modify(customer);
	}

	@Override
	public Customer find(String id) {
		return (Customer) super.find(id, Customer.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> findList() {
		return (List<Customer>) super.findList(Customer.class);
	}

	
}