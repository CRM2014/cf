/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.StorageDao;
import cf.crm.dao.support.adapter.impl.DaoAdapter;
import cf.crm.dao.support.adapter.page.Page;
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

	@Override
	public void findByPage(Page<Storage> page, Map<String, Object> like) {
		page.setOrder("stId");
		super.findByPage(Storage.class, page, like);
	}

	
}
