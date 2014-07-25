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

import cf.crm.dao.StorageDao;
import cf.crm.entity.Storage;
import cf.crm.service.StorageService;
import cf.crm.util.page.Page;

@Component
@Scope("prototype")
public class StorageServiceImpl implements StorageService {
	@Autowired
	@Qualifier("storageDaoImpl")
	private StorageDao storageDao;

	@Override
	public void add(Storage storage) {
		storageDao.add(storage);
	}

	@Override
	public void remove(Storage storage) {
		storageDao.remove(storage);
	}

	@Override
	public void modify(Storage storage) {
		storageDao.modify(storage);
	}

	@Override
	public Storage find(String id) {
		return storageDao.find(id);
	}

	@Override
	public List<Storage> findList() {
		return storageDao.findList();
	}

	@Override
	public void findByPage(Page<Storage> page, Map<String, Object> like) {
		storageDao.findByPage(page, like);
	}


}
