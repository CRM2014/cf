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

import cf.crm.dao.ContactrecordDao;
import cf.crm.dao.support.adapter.impl.DaoAdapter;
import cf.crm.dao.support.adapter.page.Page;
import cf.crm.entity.Contactrecord;

@Component
@Scope("prototype")
public class ContactrecordDaoImpl extends DaoAdapter implements ContactrecordDao {
	@Override
	public void add(Contactrecord contactrecord) {
		contactrecord.setCoreId(super.generateKey());
		super.add(contactrecord);
	}

	@Override
	public void remove(Contactrecord contactrecord) {
		super.remove(contactrecord);
	}

	@Override
	public void modify(Contactrecord contactrecord) {
		super.modify(contactrecord);
	}

	@Override
	public Contactrecord find(String id) {
		return (Contactrecord) super.find(id, Contactrecord.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contactrecord> findList() {
		return (List<Contactrecord>) super.findList(Contactrecord.class);
	}

	@Override
	public void findByPage(Page<Contactrecord> page, Map<String, Object> like) {
		page.setOrder("coreId");
		super.findByPage(Contactrecord.class, page, like);
	}

	
}
