package cf.crm.dao.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import cf.crm.entity.Storage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class DaoAdapterTest {
	@Autowired
	private DaoAdapter daoAdapter;

	@Test
	public void test() {
		Storage storage = new Storage();
		storage.setStId("1");
		storage.setStName("1s");
		daoAdapter.save(storage);
	}

}
