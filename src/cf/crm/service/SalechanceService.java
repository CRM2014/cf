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

import cf.crm.dao.support.adapter.page.Page;
import cf.crm.entity.Salechance;

public interface SalechanceService {
	public void add(Salechance salechance);

	public void remove(Salechance salechance);

	public void modify(Salechance salechance);

	public Salechance find(String id);

	public List<Salechance> findList();
	
	public void findByPage(Page<Salechance> page, Map<String, Object> like);
	
}
