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

import cf.crm.dao.SalechanceDao;
import cf.crm.dao.support.adapter.page.Page;
import cf.crm.entity.Salechance;
import cf.crm.service.SalechanceService;

@Component
@Scope("prototype")
public class SalechanceServiceImpl implements SalechanceService {
	@Autowired
	@Qualifier("salechanceDaoImpl")
	private SalechanceDao salechanceDao;

	@Override
	public void add(Salechance salechance) {
		salechanceDao.add(salechance);
	}

	@Override
	public void remove(Salechance salechance) {
		salechanceDao.remove(salechance);
	}

	@Override
	public void modify(Salechance salechance) {
		salechanceDao.modify(salechance);
	}

	@Override
	public Salechance find(String id) {
		return salechanceDao.find(id);
	}

	@Override
	public List<Salechance> findList() {
		return salechanceDao.findList();
	}


	@Override
	public void findByPage(Page<Salechance> page, Map<String, Object> like) {
		salechanceDao.findByPage(page, like);
	}

}
