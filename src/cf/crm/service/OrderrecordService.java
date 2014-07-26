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

import cf.crm.entity.Orderrecord;
import cf.crm.util.page.Page;

public interface OrderrecordService {
	public void add(Orderrecord orderrecord);

	public void remove(Orderrecord orderrecord);

	public void modify(Orderrecord orderrecord);

	public Orderrecord find(String id);

	public List<Orderrecord> findList();

	public void findByPage(Page<Orderrecord> page, Map<String, Object> like);
	
}
