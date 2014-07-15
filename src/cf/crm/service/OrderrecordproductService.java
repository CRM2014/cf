package cf.crm.service;

import java.util.List;

import cf.crm.entity.Orderrecordproduct;

public interface OrderrecordproductService {
	public void add(Orderrecordproduct orderrecordproduct);

	public void remove(Orderrecordproduct orderrecordproduct);

	public void modify(Orderrecordproduct orderrecordproduct);

	public Orderrecordproduct find(String id);

	public List<Orderrecordproduct> findList();
	
}
