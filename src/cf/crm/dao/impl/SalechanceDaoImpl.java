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

import cf.crm.dao.SalechanceDao;
import cf.crm.dao.support.adapter.impl.DaoAdapter;
import cf.crm.dao.support.adapter.page.Page;
import cf.crm.entity.Salechance;

@Component
@Scope("prototype")
public class SalechanceDaoImpl extends DaoAdapter implements SalechanceDao {
	@Override
	public void add(Salechance salechance) {
		salechance.setSachId(super.generateKey());
		super.add(salechance);
	}

	@Override
	public void remove(Salechance salechance) {
		super.remove(salechance);
	}

	@Override
	public void modify(Salechance salechance) {
		super.modify(salechance);
	}

	@Override
	public Salechance find(String id) {
		return (Salechance) super.find(id, Salechance.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Salechance> findList() {
		return (List<Salechance>) super.findList(Salechance.class);
	}

	@Override
	public void findByPage(Page<Salechance> page, Map<String, Object> like) {
		page.setOrder("sachId");
		super.findByPage(Salechance.class, page, like);
	}
	
}
