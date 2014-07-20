package cf.crm.service;

import java.util.List;
import java.util.Map;

import cf.crm.entity.Contactperson;
import cf.crm.entity.Customer;
import cf.crm.util.page.Page;

public interface ContactpersonService {
	public void add(Contactperson contactperson);

	public void remove(Contactperson contactperson);

	public void modify(Contactperson contactperson);

	public Contactperson find(String id);

	public List<Contactperson> findList();

	public void findByPage(Page<Contactperson> page, Map<String, Object> like);

}
