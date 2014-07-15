package cf.crm.service;

import java.util.List;

import cf.crm.entity.Orderrecord;

public interface OrderrecordService {
	public void add(Orderrecord orderrecord);

	public void remove(Orderrecord orderrecord);

	public void modify(Orderrecord orderrecord);

	public Orderrecord find(String id);

	public List<Orderrecord> findList();
	
}
