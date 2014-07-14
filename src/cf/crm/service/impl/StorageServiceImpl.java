package cf.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.StorageDao;
import cf.crm.entity.Storage;
import cf.crm.service.StorageService;

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


}
