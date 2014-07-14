package cf.crm.service;

import java.util.List;

import cf.crm.entity.Storage;

public interface StorageService {
	public void add(Storage storage);

	public void remove(Storage storage);

	public void modify(Storage storage);

	public Storage find(String id);

	public List<Storage> findList();
	
}
