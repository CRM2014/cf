package cf.crm.service;

import java.util.List;

import cf.crm.entity.Contactrecord;

public interface ContactrecordService {
	public void add(Contactrecord contactrecord);

	public void remove(Contactrecord contactrecord);

	public void modify(Contactrecord contactrecord);

	public Contactrecord find(String id);

	public List<Contactrecord> findList();
	
}
