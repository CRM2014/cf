package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Contactrecord;

public interface ContactrecordDao extends Dao {
	public void add(Contactrecord contactrecord);

	public void remove(Contactrecord contactrecord);

	public void modify(Contactrecord contactrecord);

	public Contactrecord find(String id);

	public List<Contactrecord> findList();
	
}
