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
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.ProductDao;
import cf.crm.entity.Product;
import cf.crm.util.page.Page;

@Component
@Scope("prototype")
public class ProductDaoImpl extends DaoAdapter implements ProductDao {
	@Override
	public void add(Product product) {
		product.setPrId(super.generateKey());
		super.add(product);
	}

	@Override
	public void remove(Product product) {
		super.remove(product);
	}

	@Override
	public void modify(Product product) {
		super.modify(product);
	}

	@Override
	public Product find(String id) {
		return (Product) super.find(id, Product.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findList() {
		return (List<Product>) super.findList(Product.class);
	}

	@Override
	public void findByPage(Page<Product> page, Map<String, Object> like) {
		page.setOrder("prId");
		super.findByPage(Product.class, page, like);
	}

}
