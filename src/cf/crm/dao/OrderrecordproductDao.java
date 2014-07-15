package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Orderrecordproduct;

public interface OrderrecordproductDao extends Dao {
	public void add(Orderrecordproduct orderrecordproduct);

	public void remove(Orderrecordproduct orderrecordproduct);

	public void modify(Orderrecordproduct orderrecordproduct);

	public Orderrecordproduct find(String id);

	public List<Orderrecordproduct> findList();
	
}
