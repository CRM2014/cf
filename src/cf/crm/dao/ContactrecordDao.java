package cf.crm.dao;

import java.util.List;
import java.util.Map;

import cf.crm.entity.Contactrecord;
import cf.crm.util.page.Page;

public interface ContactrecordDao extends Dao {
	public void add(Contactrecord contactrecord);

	public void remove(Contactrecord contactrecord);

	public void modify(Contactrecord contactrecord);

	public Contactrecord find(String id);

	public List<Contactrecord> findList();
	
	public void findByPage(Page<Contactrecord> page, Map<String, Object> like);
}
