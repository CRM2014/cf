package cf.crm.service;

public interface Service {
	public void save(Object entity);

	public Object get(String id, Class<?> clazz);
}
