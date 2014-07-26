/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

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

	public void findContributionByPage(Page page, String compositionType);

	public void findServiceByPage(Page page);

	public void findDrainByPage(Page page);

	public Object getOrderNumber();

	public Object getCustomerNumber();

	public void findCompositionByPage(Page page, String compositionType);
}
