package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Orderrecordproduct;

public interface OrderrecordproductDao extends Dao {
	public void add(Orderrecordproduct Orderrecordproduct);

	public void remove(Orderrecordproduct Orderrecordproduct);

	public void modify(Orderrecordproduct Orderrecordproduct);

	public Orderrecordproduct find(String id);

	public List<Orderrecordproduct> findList();
	
}
