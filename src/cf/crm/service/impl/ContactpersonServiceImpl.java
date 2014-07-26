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

import cf.crm.dao.ContactpersonDao;
import cf.crm.entity.Contactperson;
import cf.crm.service.ContactpersonService;
import cf.crm.util.page.Page;

@Component
@Scope("prototype")
public class ContactpersonServiceImpl implements ContactpersonService {
	@Autowired
	@Qualifier("contactpersonDaoImpl")
	private ContactpersonDao contactpersonDao;

	@Override
	public void add(Contactperson contactperson) {
		contactpersonDao.add(contactperson);
	}

	@Override
	public void remove(Contactperson contactperson) {
		contactpersonDao.remove(contactperson);
	}

	@Override
	public void modify(Contactperson contactperson) {
		contactpersonDao.modify(contactperson);
	}

	@Override
	public Contactperson find(String id) {
		return contactpersonDao.find(id);
	}

	@Override
	public List<Contactperson> findList() {
		return contactpersonDao.findList();
	}

	@Override
	public void findByPage(Page<Contactperson> page, Map<String, Object> like) {
		contactpersonDao.findByPage(page, like);
	}

}
