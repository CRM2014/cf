/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.action.statistics;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.entity.Customer;
import cf.crm.service.CustomerService;
import cf.crm.util.page.Page;
import cf.crm.util.page.PageHelper;

@Controller
@Scope("prototype")
public class StatisticsAction extends BaseAction {

	/**
	 * 
	 */

	private static final long serialVersionUID = -4301569101201549329L;
	@Autowired
	@Qualifier("customerServiceImpl")
	private CustomerService customerService;
	private String compositionType;
	private Customer condition;
	private Page page;

	public String contribution() {
		if (page == null)
			page = PageHelper.generatePage();
		customerService.findContributionByPage(page, compositionType);
		log.info(JSONArray.fromObject(page.getList()));
		return "contribution";
	}

	public String composition() {
		if (page == null)
			page = PageHelper.generatePage();
		customerService.findCompositionByPage(page, compositionType);
		log.info(JSONArray.fromObject(page.getList()));
		return "composition";
	}

	public String service() {
		if (page == null)
			page = PageHelper.generatePage();
		customerService.findServiceByPage(page);
		log.info(JSONArray.fromObject(page.getList()));
		return "service";
	}

	public String drain() {
		if (page == null)
			page = PageHelper.generatePage();
		customerService.findDrainByPage(page);
		log.info(JSONArray.fromObject(page.getList()));
		return "drain";
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public String getCompositionType() {
		if (null == compositionType || "".equals(compositionType)) {
			compositionType = "1";
		}
		return compositionType;
	}

	public void setCompositionType(String compositionType) {
		this.compositionType = compositionType;
	}

	public Customer getCondition() {
		return condition;
	}

	public void setCondition(Customer condition) {
		this.condition = condition;
	}

}
