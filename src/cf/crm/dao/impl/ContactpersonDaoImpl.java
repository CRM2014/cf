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

import cf.crm.dao.ContactpersonDao;
import cf.crm.dao.support.adapter.impl.DaoAdapter;
import cf.crm.dao.support.adapter.page.Page;
import cf.crm.entity.Contactperson;

@Component
@Scope("prototype")
public class ContactpersonDaoImpl extends DaoAdapter implements
		ContactpersonDao {
	@Override
	public void add(Contactperson contactperson) {
		contactperson.setCopeId(super.generateKey());
		super.add(contactperson);
	}

	@Override
	public void remove(Contactperson contactperson) {
		super.remove(contactperson);
	}

	@Override
	public void modify(Contactperson contactperson) {
		super.modify(contactperson);
	}

	@Override
	public Contactperson find(String id) {
		return (Contactperson) super.find(id, Contactperson.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contactperson> findList() {
		return (List<Contactperson>) super.findList(Contactperson.class);
	}

	@Override
	public void findByPage(Page<Contactperson> page, Map<String, Object> like) {
		page.setOrder("copeId");
		super.findByPage(Contactperson.class, page, like);
	}
}
