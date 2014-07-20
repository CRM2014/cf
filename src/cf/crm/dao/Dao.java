package cf.crm.dao;

import java.util.List;
import java.util.Map;

import cf.crm.util.page.Page;

public interface Dao {
	public void add(Object entity);

	public void remove(Object entity);

	public void modify(Object entity);

	public Object find(String id, Class<?> clazz);

	public List<?> findList(Class<?> clazz);

	public void findByPage(Class<?> clazz, Page<?> page,
			Map<String, Object> like);

	public void findByPage(Class<?> clazz, Page<?> page,
			Map<String, Object> eq, Map<String, Object> like);

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
}
