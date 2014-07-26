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

import cf.crm.dao.DevelopmentDao;
import cf.crm.entity.Development;
import cf.crm.service.DevelopmentService;
import cf.crm.util.page.Page;

@Component
@Scope("prototype")
public class DevelopmentServiceImpl implements DevelopmentService {
	@Autowired
	@Qualifier("developmentDaoImpl")
	private DevelopmentDao developmentDao;

	@Override
	public void add(Development development) {
		developmentDao.add(development);
	}

	@Override
	public void remove(Development development) {
		developmentDao.remove(development);
	}

	@Override
	public void modify(Development development) {
		developmentDao.modify(development);
	}

	@Override
	public Development find(String id) {
		return developmentDao.find(id);
	}

	@Override
	public List<Development> findList() {
		return developmentDao.findList();
	}

	@Override
	public void findByPage(Page<Development> page, Map<String, Object> like) {
		developmentDao.findByPage(page, like);
	}

	@Override
	public void findListByField(String name, Object value) {
		developmentDao.findListByField(name, value);
	}

}
