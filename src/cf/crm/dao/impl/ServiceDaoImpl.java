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

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.ServiceDao;
import cf.crm.entity.Service;

@Component
@Scope("prototype")
public class ServiceDaoImpl extends DaoAdapter implements ServiceDao {
	@Override
	public void add(Service service) {
		service.setSeId(super.generateKey());
		super.add(service);
	}

	@Override
	public void remove(Service service) {
		super.remove(service);
	}

	@Override
	public void modify(Service service) {
		super.modify(service);
	}

	@Override
	public Service find(String id) {
		return (Service) super.find(id, Service.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Service> findList() {
		return (List<Service>) super.findList(Service.class);
	}
	
}
