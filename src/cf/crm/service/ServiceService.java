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

import cf.crm.entity.Service;

public interface ServiceService {
	public void add(Service service);
	
	public void remove(Service service);

	public void modify(Service service);

	public Service find(String id);

	public List<Service> findList();
	
}
