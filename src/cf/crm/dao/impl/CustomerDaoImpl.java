package cf.crm.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.CustomerDao;
import cf.crm.entity.Customer;
import cf.crm.entity.User;
import cf.crm.util.page.Page;

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

	@Override
	public void findByPage(Page<Customer> page, Map<String, Object> like) {
		super.findByPage(Customer.class, page, like);
	}

	// 求订单金额的
	@Override
	public void findContributionByPage(Page page) {
		String sql = "SELECT c.cuName, o.orreprNum*p.prPrice as orderAmount"
				+ " FROM orderrecordproduct o, product p, customer c, OrderRecord od"
				+ " WHERE o.prId=p.prID and c.cuId=od.cuID and od.orreID = o.orreID";

		super.findByPage(page, sql);
	}

	// 根据等级求出出客户数量的
	@Override
	public void findCompositionByPage(Page page) {
		String sql = "select cuLevel,count(cuLevel) cuTotal from customer group by cuLevel";
		super.findByPage(page, sql);
	}

	// 根据条目求出服务数量的
	@Override
	public void findServiceByPage(Page page) {
		String sql = "select seType,count(seType) seTotal from service group by seType";
		super.findByPage(page, sql);
	}

	// 流失分析
	@Override
	public void findDrainByPage(Page page) {
		String sql = "select ou.ouflTime, c.cuName, u.usName, ou.ouflReson"
				+ " from customer c, user u, outflow ou"
				+ " where c.cuID=ou.cuID and u.usID=c.usID";
		super.findByPage(page, sql);
	}
}
