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

import cf.crm.entity.Outflow;
import cf.crm.util.page.Page;

public interface OutflowService {
	public void add(Outflow outflow);

	public void remove(Outflow outflow);

	public void modify(Outflow outflow);

	public Outflow find(String id);

	public List<Outflow> findList();

	public void findByPage(Page<Outflow> page, Map<String, Object> like);
	
}
