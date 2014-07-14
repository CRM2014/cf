package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Product;

public interface ProductDao extends Dao {
	public void add(Product Product);

	public void remove(Product Product);

	public void modify(Product Product);

	public Product find(String id);

	public List<Product> findList();
	
}
