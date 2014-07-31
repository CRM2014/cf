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

import cf.crm.dao.support.adapter.Dao;
import cf.crm.entity.Orderrecordproduct;
import cf.crm.entity.Product;

public interface OrderrecordproductDao extends Dao {
	public void add(Orderrecordproduct orderrecordproduct);

	public void remove(Orderrecordproduct orderrecordproduct);

	public void modify(Orderrecordproduct orderrecordproduct);

	public Orderrecordproduct find(String id);

	public List<Orderrecordproduct> findList();

	public List<Orderrecordproduct> findListByProduct(Product product);
	
}
