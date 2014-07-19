package cf.crm.dao;

import java.util.List;
import java.util.Map;

import cf.crm.entity.Orderrecord;
import cf.crm.util.page.Page;

public interface OrderrecordDao extends Dao {
	public void add(Orderrecord orderrecord);

	public void remove(Orderrecord orderrecord);

	public void modify(Orderrecord orderrecord);

	public Orderrecord find(String id);

	public List<Orderrecord> findList();
	
	public void findByPage(Page<Orderrecord> page, Map<String, Object> like);
}
