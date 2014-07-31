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

import cf.crm.dao.support.adapter.Dao;
import cf.crm.dao.support.adapter.page.Page;
import cf.crm.entity.Development;

public interface DevelopmentDao extends Dao {
	public void add(Development development);

	public void remove(Development development);

	public void modify(Development development);

	public Development find(String id);

	public List<Development> findList();
	
	public void findByPage(Page<Development> page, Map<String, Object> like);

	public void findListByField(String name, Object value);
}
