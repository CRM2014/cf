/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.DatadictionaryDao;
import cf.crm.entity.Datadictionary;
import cf.crm.service.DatadictionaryService;
import cf.crm.util.page.Page;

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

	public void findByPage(Page<Datadictionary> page, Map<String, Object> like) {
		datadictionaryDao.findByPage(page, like);
	}

	@Override
	public List<Datadictionary> findServiceList() {
		return datadictionaryDao.findServiceList();
	}

}
