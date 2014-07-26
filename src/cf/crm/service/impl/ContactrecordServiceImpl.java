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

import cf.crm.dao.ContactrecordDao;
import cf.crm.entity.Contactrecord;
import cf.crm.service.ContactrecordService;
import cf.crm.util.page.Page;

@Component
@Scope("prototype")
public class ContactrecordServiceImpl implements ContactrecordService {
	@Autowired
	@Qualifier("contactrecordDaoImpl")
	private ContactrecordDao contactrecordDao;

	@Override
	public void add(Contactrecord contactrecord) {
		contactrecordDao.add(contactrecord);
	}

	@Override
	public void remove(Contactrecord contactrecord) {
		contactrecordDao.remove(contactrecord);
	}

	@Override
	public void modify(Contactrecord contactrecord) {
		contactrecordDao.modify(contactrecord);
	}

	@Override
	public Contactrecord find(String id) {
		return contactrecordDao.find(id);
	}

	@Override
	public List<Contactrecord> findList() {
		return contactrecordDao.findList();
	}

	@Override
	public void findByPage(Page<Contactrecord> page, Map<String, Object> like) {
		contactrecordDao.findByPage(page, like);
	}
}
