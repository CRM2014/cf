package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Datadictionary;

public interface DatadictionaryDao extends Dao {
	public void add(Datadictionary datadictionary);

	public void remove(Datadictionary datadictionary);

	public void modify(Datadictionary datadictionary);

	public Datadictionary find(String id);

	public List<Datadictionary> findList();
	
}