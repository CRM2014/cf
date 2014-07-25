/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.service;

import java.util.List;
import java.util.Map;

import cf.crm.entity.Servicecustomer;
import cf.crm.util.page.Page;

public interface ServicecustomerService {
	public void add(Servicecustomer servicecustomer);

	public void remove(Servicecustomer servicecustomer);

	public void modify(Servicecustomer servicecustomer);

	public Servicecustomer find(String id);

	public List<Servicecustomer> findList();

	public void findByPage(Page<Servicecustomer> page, Map<String, Object> like);

	public void findAssignByPage(Page<Servicecustomer> page,
			Map<String, Object> like);

	public void findDealByPage(Page<Servicecustomer> page,
			Map<String, Object> like);

	public void findFeedbackByPage(Page<Servicecustomer> page,
			Map<String, Object> like);

	public void findArchiveByPage(Page<Servicecustomer> page,
			Map<String, Object> like);
}
