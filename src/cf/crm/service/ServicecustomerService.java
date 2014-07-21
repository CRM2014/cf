package cf.crm.service;

import java.util.List;
import java.util.Map;

import cf.crm.entity.Servicecustomer;
import cf.crm.util.page.Page;

public interface ServicecustomerService {
	public void add(Servicecustomer servicecustomer);

	public void remove(Servicecustomer servicecustomer);

	public void modify(Servicecustomer servicecustomer);

	public Servicecustomer find(String id);

	public List<Servicecustomer> findList();

	public void findByPage(Page<Servicecustomer> page, Map<String, Object> like);

	void findByPage(Page<Servicecustomer> page, Map<String, Object> eq,
			Map<String, Object> not, Map<String, Object> like,
			List<String> empty);

	void findAssignByPage(Page<Servicecustomer> page, Map<String, Object> like);

	void findDealByPage(Page<Servicecustomer> page, Map<String, Object> like);

	void findFeedbackByPage(Page<Servicecustomer> page, Map<String, Object> like);

	void findArchiveByPage(Page<Servicecustomer> page, Map<String, Object> like);
}
