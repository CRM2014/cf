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

import cf.crm.entity.Contactperson;
import cf.crm.util.page.Page;

public interface ContactpersonDao extends Dao {
	public void add(Contactperson contactperson);

	public void remove(Contactperson contactperson);

	public void modify(Contactperson contactperson);

	public Contactperson find(String id);

	public List<Contactperson> findList();

	public void findByPage(Page<Contactperson> page, Map<String, Object> like);
	
}
