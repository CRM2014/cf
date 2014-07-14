package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Orderrecord;

public interface OrderrecordDao extends Dao {
	public void add(Orderrecord Orderrecord);

	public void remove(Orderrecord Orderrecord);

	public void modify(Orderrecord Orderrecord);

	public Orderrecord find(String id);

	public List<Orderrecord> findList();
	
}
