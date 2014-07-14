package cf.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.StorageDao;
import cf.crm.entity.Storage;

@Component
@Scope("prototype")
public class StorageDaoImpl extends DaoAdapter implements StorageDao {
	@Override
	public void add(Storage storage) {
		storage.setStId(super.generateKey());
		super.add(storage);
	}

	@Override
	public void remove(Storage storage) {
		super.remove(storage);
	}

	@Override
	public void modify(Storage storage) {
		super.modify(storage);
	}

	@Override
	public Storage find(String id) {
		return (Storage) super.find(id, Storage.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Storage> findList() {
		return (List<Storage>) super.findList(Storage.class);
	}

	
}
