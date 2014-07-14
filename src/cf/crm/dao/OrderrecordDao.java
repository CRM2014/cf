package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Orderrecord;

public interface OrderrecordDao extends Dao {
	public void add(Orderrecord orderrecord);

	public void remove(Orderrecord orderrecord);

	public void modify(Orderrecord orderrecord);

	public Orderrecord find(String id);

	public List<Orderrecord> findList();
	
}
