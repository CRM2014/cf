package cf.crm.dao;

import java.util.List;
import java.util.Map;

import cf.crm.entity.Datadictionary;
import cf.crm.util.page.Page;

public interface DatadictionaryDao extends Dao {
	public void add(Datadictionary datadictionary);

	public void remove(Datadictionary datadictionary);

	public void modify(Datadictionary datadictionary);

	public Datadictionary find(String id);

	public List<Datadictionary> findList();

	public void findByPage(Page<Datadictionary> page, Map<String, Object> like);
	
}
