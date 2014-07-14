package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Contactrecord;

public interface ContactrecordDao extends Dao {
	public void add(Contactrecord Contactrecord);

	public void remove(Contactrecord Contactrecord);

	public void modify(Contactrecord Contactrecord);

	public Contactrecord find(String id);

	public List<Contactrecord> findList();
	
}
