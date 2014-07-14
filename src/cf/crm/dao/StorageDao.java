package cf.crm.dao;

import java.util.List;

import cf.crm.entity.Storage;

public interface StorageDao extends Dao {
	public void add(Storage Storage);

	public void remove(Storage Storage);

	public void modify(Storage Storage);

	public Storage find(String id);

	public List<Storage> findList();
	
}
