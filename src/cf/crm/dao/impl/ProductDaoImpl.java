package cf.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.ProductDao;
import cf.crm.entity.Product;

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

	
}
