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

import cf.crm.dao.OrderrecordDao;
import cf.crm.entity.Orderrecord;
import cf.crm.util.page.Page;

@Component
@Scope("prototype")
public class OrderrecordDaoImpl extends DaoAdapter implements OrderrecordDao {
	@Override
	public void add(Orderrecord orderrecord) {
		orderrecord.setOrreId(super.generateKey());
		super.add(orderrecord);
	}

	@Override
	public void remove(Orderrecord orderrecord) {
		super.remove(orderrecord);
	}

	@Override
	public void modify(Orderrecord orderrecord) {
		super.modify(orderrecord);
	}

	@Override
	public Orderrecord find(String id) {
		return (Orderrecord) super.find(id, Orderrecord.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Orderrecord> findList() {
		return (List<Orderrecord>) super.findList(Orderrecord.class);
	}

	@Override
	public void findByPage(Page<Orderrecord> page, Map<String, Object> like) {
		page.setOrder("orreId");
		super.findByPage(Orderrecord.class, page, like);
	}

	
}
