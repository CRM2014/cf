package cf.crm.service;

import java.util.List;
import java.util.Map;

import cf.crm.entity.Outflow;
import cf.crm.util.page.Page;

public interface OutflowService {
	public void add(Outflow outflow);

	public void remove(Outflow outflow);

	public void modify(Outflow outflow);

	public Outflow find(String id);

	public List<Outflow> findList();

	public void findByPage(Page<Outflow> page, Map<String, Object> like);
	
}
