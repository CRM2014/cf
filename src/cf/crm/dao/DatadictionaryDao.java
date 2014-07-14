package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Datadictionary;

public interface DatadictionaryDao extends Dao {
	public void add(Datadictionary Datadictionary);

	public void remove(Datadictionary Datadictionary);

	public void modify(Datadictionary Datadictionary);

	public Datadictionary find(String id);

	public List<Datadictionary> findList();
	
}
