package cf.crm.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.dao.UserDao;

@Component
@Scope("prototype")
public class UserDaoImpl extends DaoAdapter implements UserDao {

}
