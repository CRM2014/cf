package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Storage;

public interface StorageDao extends Dao {
	public void add(Storage storage);

	public void remove(Storage storage);

	public void modify(Storage storage);

	public Storage find(String id);

	public List<Storage> findList();
	
}
