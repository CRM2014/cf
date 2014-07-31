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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cf.crm.dao.support.adapter.impl.DaoAdapter;
import cf.crm.dao.support.adapter.page.Page;
import cf.crm.dao.support.adapter.page.PageHelper;
import cf.crm.entity.Storage;
import cf.crm.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class DaoAdapterTest {
	@Autowired
	private DaoAdapter daoAdapter;

	@Test
	public void addTest() {
		Storage storage = new Storage();
		storage.setStId("1");
		storage.setStName("2");
		daoAdapter.add(storage);		
	}
	@Test
	public void removeTest() {
		Storage storage = new Storage();
		storage.setStId("1");
		storage.setStName("2");
		daoAdapter.remove(storage);		
	}
	@Test
	public void findTest() {
		Storage storage = new Storage();
		storage.setStId("1");
		storage.setStName("2");
		daoAdapter.remove(storage);		
	}
	@Test
	public void modifyTest() {
		Storage storage = new Storage();
		storage.setStId("5");
		storage.setStName("2");
		daoAdapter.modify(storage);		
	}
	@Test
	public void findByPageTest() {

		Page page = PageHelper.generatePage();
		daoAdapter.findByPage(User.class,page,null);		
	}
	@Test
	public void findListByFieldTest() {
		Storage storage = new Storage();
		storage.setStId("1");
		storage.setStName("2");
		daoAdapter.findByField(Storage.class,"stId","1");		
	}
	@Test
	public void  findLikeListByFieldTest() {
		Storage storage = new Storage();
		storage.setStId("1");
		storage.setStName("2");
		daoAdapter. findLikeListByField(Storage.class,"stId","1");		
	}
	
}
