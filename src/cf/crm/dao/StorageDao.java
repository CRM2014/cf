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

import cf.crm.entity.Storage;
import cf.crm.util.page.Page;

public interface StorageDao extends Dao {
	public void add(Storage storage);

	public void remove(Storage storage);

	public void modify(Storage storage);

	public Storage find(String id);

	public List<Storage> findList();

	public void findByPage(Page<Storage> page, Map<String, Object> like);
	
}
