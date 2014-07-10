package cf.crm.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cf.crm.service.UserService;

@Component
@Scope("prototype")
public class UserServiceImpl extends ServiceAdapter implements UserService {

}
