package cf.crm.dao.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.CustomerDao;
import cf.crm.entity.Customer;
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

	@Override
	public Object getOrderNumber() {
		List<List<String>> lists = new ArrayList<List<String>>();
		List<String> valueList = new ArrayList<String>();
		List<String> titleList = new ArrayList<String>();
		for (int i = 12; i > 0; i--) {
			String sql = "SELECT COUNT(*), DATE_FORMAT(NOW(),'%Y%m')-"
					+ i
					+ " FROM OrderRecord o WHERE DATE_FORMAT(o.orreDate,'%Y%m')= DATE_FORMAT(NOW(),'%Y%m')-"
					+ i;
			Object[] s = (Object[]) super.getSession().createSQLQuery(sql)
					.uniqueResult();
			valueList.add(s[0].toString());
			titleList.add(s[1].toString());
		}
		lists.add(titleList);
		lists.add(valueList);
		return lists;
	}

	@Override
	public Object getCustomerNumber() {
		List<List<String>> lists = new ArrayList<List<String>>();
		List<String> valueList = new ArrayList<String>();
		for (int i = 1; i <= 5; i++) {
			String sql = "SELECT COUNT(*),c.cuLevel FROM customer c WHERE c.cuLevel ="
					+ i;
			Object[] s = (Object[]) super.getSession().createSQLQuery(sql)
					.uniqueResult();
			valueList.add(s[0].toString());
		}
		lists.add(valueList);
		return lists;
	}
}
