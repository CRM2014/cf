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
import cf.crm.entity.Contactrecord;

public interface ContactrecordDao extends Dao {
	public void add(Contactrecord contactrecord);

	public void remove(Contactrecord contactrecord);

	public void modify(Contactrecord contactrecord);

	public Contactrecord find(String id);

	public List<Contactrecord> findList();
	
	public void findByPage(Page<Contactrecord> page, Map<String, Object> like);
}
