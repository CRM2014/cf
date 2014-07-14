package cf.crm.service;

import java.util.List;

import cf.crm.entity.Product;

public interface ProductService {
	public void add(Product product);

	public void remove(Product product);

	public void modify(Product product);

	public Product find(String id);

	public List<Product> findList();
	
}
