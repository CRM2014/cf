/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.service;

import java.util.List;
import java.util.Map;

import cf.crm.entity.Datadictionary;
import cf.crm.util.page.Page;

public interface DatadictionaryService {
	public void add(Datadictionary datadictionary);

	public void remove(Datadictionary datadictionary);

	public void modify(Datadictionary datadictionary);

	public Datadictionary find(String id);

	public List<Datadictionary> findList();

	public void findByPage(Page<Datadictionary> page, Map<String, Object> like);

	public List<Datadictionary> findServiceList();
	
}
