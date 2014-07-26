/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.dao.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.OrderrecordproductDao;
import cf.crm.entity.Orderrecordproduct;
import cf.crm.entity.Product;

@Component
@Scope("prototype")
public class OrderrecordproductDaoImpl extends DaoAdapter implements
		OrderrecordproductDao {
	@Override
	public void add(Orderrecordproduct orderrecordproduct) {
		orderrecordproduct.setOrreprId(super.generateKey());
		super.add(orderrecordproduct);
	}

	@Override
	public void remove(Orderrecordproduct orderrecordproduct) {
		super.remove(orderrecordproduct);
	}

	@Override
	public void modify(Orderrecordproduct orderrecordproduct) {
		super.modify(orderrecordproduct);
	}

	@Override
	public Orderrecordproduct find(String id) {
		return (Orderrecordproduct) super.find(id, Orderrecordproduct.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Orderrecordproduct> findList() {
		return (List<Orderrecordproduct>) super
				.findList(Orderrecordproduct.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Orderrecordproduct> findListByProduct(Product product) {
		return (List<Orderrecordproduct>) super.findListByField(
				Orderrecordproduct.class, "product", product, null);
	}
}
