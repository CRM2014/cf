package cf.crm.dao;

import java.util.List;

public interface Dao {
	public void add(Object entity);

	public void remove(Object entity);

	public void modify(Object entity);

	public Object find(String id, Class<?> clazz);

	public List<?> findList(Class<?> clazz);
}
