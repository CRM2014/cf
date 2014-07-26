/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.OrderrecordproductDao;
import cf.crm.entity.Orderrecordproduct;
import cf.crm.entity.Product;
import cf.crm.service.OrderrecordproductService;

@Component
@Scope("prototype")
public class OrderrecordproductServiceImpl implements OrderrecordproductService {
	@Autowired
	@Qualifier("orderrecordproductDaoImpl")
	private OrderrecordproductDao orderrecordproductDao;

	@Override
	public void add(Orderrecordproduct orderrecordproduct) {
		orderrecordproductDao.add(orderrecordproduct);
	}

	@Override
	public void remove(Orderrecordproduct orderrecordproduct) {
		orderrecordproductDao.remove(orderrecordproduct);
	}

	@Override
	public void modify(Orderrecordproduct orderrecordproduct) {
		orderrecordproductDao.modify(orderrecordproduct);
	}

	@Override
	public Orderrecordproduct find(String id) {
		return orderrecordproductDao.find(id);
	}

	@Override
	public List<Orderrecordproduct> findList() {
		return orderrecordproductDao.findList();
	}

	@Override
	public List<Orderrecordproduct> findListByProduct(Product product) {
		return orderrecordproductDao.findListByProduct(product);
	}

}
