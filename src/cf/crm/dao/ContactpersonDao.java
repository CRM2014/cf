package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Contactperson;

public interface ContactpersonDao extends Dao {
	public void add(Contactperson Contactperson);

	public void remove(Contactperson Contactperson);

	public void modify(Contactperson Contactperson);

	public Contactperson find(String id);

	public List<Contactperson> findList();
	
}
