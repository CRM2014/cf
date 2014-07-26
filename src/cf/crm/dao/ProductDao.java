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

import cf.crm.entity.Product;
import cf.crm.util.page.Page;

public interface ProductDao extends Dao {
	public void add(Product product);

	public void remove(Product product);

	public void modify(Product product);

	public Product find(String id);

	public List<Product> findList();

	public void findByPage(Page<Product> page, Map<String, Object> like);
	
}
