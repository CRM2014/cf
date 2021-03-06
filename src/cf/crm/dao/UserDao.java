/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.dao;

import java.util.List;
import java.util.Map;

import cf.crm.entity.User;
import cf.crm.util.page.Page;

public interface UserDao extends Dao {
	public void add(User user);

	public void remove(User user);

	public void modify(User user);

	public User find(String id);

	public List<User> findList();

	public User findByUserName(String userName);

	public void findByPage(Page<User> page, Map<String, Object> like);

	public List<User> findListByRole(String role);

	public void findByPageIncludeSystem(Page<User> page,
			Map<String, Object> like);

	public void findByPageNoSystem(Page<User> page, Map<String, Object> like);
}
