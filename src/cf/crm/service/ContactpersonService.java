package cf.crm.service;

import java.util.List;

import cf.crm.entity.Contactperson;

public interface ContactpersonService {
	public void add(Contactperson contactperson);

	public void remove(Contactperson contactperson);

	public void modify(Contactperson contactperson);

	public Contactperson find(String id);

	public List<Contactperson> findList();
	
}
