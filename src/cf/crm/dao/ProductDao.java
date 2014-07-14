package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Product;

public interface ProductDao extends Dao {
	public void add(Product product);

	public void remove(Product product);

	public void modify(Product product);

	public Product find(String id);

	public List<Product> findList();
	
}
