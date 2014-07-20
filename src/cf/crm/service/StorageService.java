package cf.crm.service;

import java.util.List;
import java.util.Map;

import cf.crm.entity.Storage;
import cf.crm.util.page.Page;

public interface StorageService {
	public void add(Storage storage);

	public void remove(Storage storage);

	public void modify(Storage storage);

	public Storage find(String id);

	public List<Storage> findList();

	public void findByPage(Page<Storage> page, Map<String, Object> like);
	
}
