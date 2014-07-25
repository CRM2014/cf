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

import org.hibernate.criterion.Criterion;

import cf.crm.entity.Servicecustomer;
import cf.crm.util.page.Page;

public interface Dao {
	/**
	 * 添加一个实体
	 * 
	 * @author qiyu
	 * 
	 * @param entity
	 *            实体
	 */
	public void add(Object entity);

	/**
	 * 删除一个实体
	 * 
	 * @author qiyu
	 * 
	 * @param entity
	 *            实体
	 */
	public void remove(Object entity);

	/**
	 * 修改一个实体
	 * 
	 * @author qiyu
	 * 
	 * @param entity
	 *            实体
	 */
	public void modify(Object entity);

	/**
	 * 查找一个实体，根据ID、类型
	 * 
	 * @author qiyu
	 * 
	 * @param id
	 *            ID
	 * @param clazz
	 *            类型
	 */
	public Object find(String id, Class<?> clazz);

	/**
	 * 查找一个实体，根据类型、参数名、参数值
	 * 
	 * @author qiyu
	 * 
	 * @param clazz
	 *            类型
	 * @param name
	 *            参数名
	 * @param value
	 *            参数值
	 * @return 实体
	 */
	public Object findByField(Class<?> clazz, String name, Object value);

	/**
	 * 查找一个实体列表，根据类型、参数名、参数值
	 * 
	 * @author qiyu
	 * 
	 * @param clazz
	 *            类型
	 * @param name
	 *            参数名
	 * @param value
	 *            参数值
	 * @return 实体列表
	 */
	public List<?> findListByField(Class<?> clazz, String name, Object value);

	public List<?> findLikeListByField(Class<?> clazz, String name, Object value);

	/**
	 * 查找实体列表，根据类型
	 * 
	 * @author qiyu
	 * 
	 * @param clazz
	 *            类型
	 */
	public List<?> findList(Class<?> clazz);

	/**
	 * 查找一个实体列表，根据类型、模糊查询条件、等于条件
	 * 
	 * @param clazz
	 *            类型
	 * @param eq
	 *            模糊查询条件
	 * @param like
	 *            等于条件
	 * @return 实体列表
	 */
	public List<?> findList(Class<?> clazz, Map<String, Object> eq,
			Map<String, Object> like);

	/**
	 * 查找一个实体列表，根据类型、分页信息、模糊查询条件
	 * 
	 * @author qiyu
	 * 
	 * @param clazz
	 *            类型
	 * @param page
	 *            分页信息
	 * @param like
	 *            模糊查询条件
	 * @return 实体列表
	 */
	public void findByPage(Class<?> clazz, Page<?> page,
			Map<String, Object> like);

	public void findByPage(Class<?> clazz, Page<?> page,
			Map<String, Object> like, List<Criterion> criterion);

	public void findByPage(Page page, String sql);
}
