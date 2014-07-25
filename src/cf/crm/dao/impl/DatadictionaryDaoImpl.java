package cf.crm.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.DatadictionaryDao;
import cf.crm.entity.Datadictionary;
import cf.crm.entity.User;
import cf.crm.util.Info.Dictionary;
import cf.crm.util.page.Page;

@Component
@Scope("prototype")
public class DatadictionaryDaoImpl extends DaoAdapter implements
		DatadictionaryDao {
	@Override
	public void add(Datadictionary datadictionary) {
		datadictionary.setDadiId(super.generateKey());
		super.add(datadictionary);
	}

	@Override
	public void remove(Datadictionary datadictionary) {
		super.remove(datadictionary);
	}

	@Override
	public void modify(Datadictionary datadictionary) {
		super.modify(datadictionary);
	}

	@Override
	public Datadictionary find(String id) {
		return (Datadictionary) super.find(id, Datadictionary.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Datadictionary> findList() {
		return (List<Datadictionary>) super.findList(Datadictionary.class);
	}

	@Override
	public void findByPage(Page<Datadictionary> page, Map<String, Object> like) {
		super.findByPage(Datadictionary.class, page, like);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Datadictionary> findServiceList() {
		return (List<Datadictionary>) super.findListByField(
				Datadictionary.class, "dadiType", Dictionary.SERVICETYPE);
	}

}
