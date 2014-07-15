package cf.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.DatadictionaryDao;
import cf.crm.entity.Datadictionary;
import cf.crm.service.DatadictionaryService;

@Component
@Scope("prototype")
public class DatadictionaryServiceImpl implements DatadictionaryService {
	@Autowired
	@Qualifier("datadictionaryDaoImpl")
	private DatadictionaryDao datadictionaryDao;

	@Override
	public void add(Datadictionary datadictionary) {
		datadictionaryDao.add(datadictionary);
	}

	@Override
	public void remove(Datadictionary datadictionary) {
		datadictionaryDao.remove(datadictionary);
	}

	@Override
	public void modify(Datadictionary datadictionary) {
		datadictionaryDao.modify(datadictionary);
	}

	@Override
	public Datadictionary find(String id) {
		return datadictionaryDao.find(id);
	}

	@Override
	public List<Datadictionary> findList() {
		return datadictionaryDao.findList();
	}


}
