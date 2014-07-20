package cf.crm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.ProductDao;
import cf.crm.entity.Product;
import cf.crm.service.ProductService;
import cf.crm.util.page.Page;

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
