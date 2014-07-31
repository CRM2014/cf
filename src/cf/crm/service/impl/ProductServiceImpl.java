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
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.ProductDao;
import cf.crm.dao.support.adapter.page.Page;
import cf.crm.entity.Product;
import cf.crm.service.ProductService;

@Component
@Scope("prototype")
public class ProductServiceImpl implements ProductService {
	@Autowired
	@Qualifier("productDaoImpl")
	private ProductDao productDao;

	@Override
	public void add(Product product) {
		productDao.add(product);
	}

	@Override
	public void remove(Product product) {
		productDao.remove(product);
	}

	@Override
	public void modify(Product product) {
		productDao.modify(product);
	}

	@Override
	public Product find(String id) {
		return productDao.find(id);
	}

	@Override
	public List<Product> findList() {
		return productDao.findList();
	}

	@Override
	public void findByPage(Page<Product> page, Map<String, Object> like) {
		productDao.findByPage(page, like);
		
	}



}
