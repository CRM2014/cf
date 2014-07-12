package cf.crm.dao;

public interface Dao {
	public void save(Object entity);

	public void delete(Object entity);

	public Object get(String id, Class<?> clazz);

	public void getli();
}
