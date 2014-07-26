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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cf.crm.entity.Storage;
import cf.crm.entity.User;
import cf.crm.util.Info.Role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class DaoAdapterTest {
	@Autowired
	private DaoAdapter daoAdapter;

	public void test() {
		List<Storage> list = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			Storage storage = new Storage();
			storage.setStId(daoAdapter.generateKey());
			storage.setStName(daoAdapter.generateKey());
			list.add(storage);
		}
		daoAdapter.add(list);
	}

	@Test
	public void test2() {
		List<User> list = new ArrayList<>();
		for (int i = 0; i < 100000; i++) {
			User user = new User();
			user.setUsId(daoAdapter.generateKey());
			user.setUsRole(Role.SENIOR);
			user.setUsName(daoAdapter.generateKey(7));
			user.setUsUserName(daoAdapter.generateKey(7));
			user.setUsPassword("666666");
			user.setUsCreateTime(new Date());
			list.add(user);
		}
		daoAdapter.add(list);
	}
}
