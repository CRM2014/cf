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

import cf.crm.dao.OutflowDao;
import cf.crm.entity.Outflow;
import cf.crm.util.page.Page;

@Component
@Scope("prototype")
public class OutflowDaoImpl extends DaoAdapter implements OutflowDao {
	@Override
	public void add(Outflow outflow) {
		outflow.setOuflId(super.generateKey());
		super.add(outflow);
	}

	@Override
	public void remove(Outflow outflow) {
		super.remove(outflow);
	}

	@Override
	public void modify(Outflow outflow) {
		super.modify(outflow);
	}

	@Override
	public Outflow find(String id) {
		return (Outflow) super.find(id, Outflow.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Outflow> findList() {
		return (List<Outflow>) super.findList(Outflow.class);
	}

	@Override
	public void findByPage(Page<Outflow> page, Map<String, Object> like) {
		page.setOrder("ouflId");
		super.findByPage(Outflow.class, page, like);
	}

	
}
