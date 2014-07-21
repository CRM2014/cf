package cf.crm.action.statistics;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
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
	private Page page;

	public String contribution() {
		page = PageHelper.generatePage();
		customerService.findContributionByPage(page);
		log.info(JSONArray.fromObject(page.getList()));
		return "contribution";
	}

	public String composition() {
		page = PageHelper.generatePage();
		customerService.findCompositionByPage(page);
		log.info(JSONArray.fromObject(page.getList()));
		return "composition";
	}

	public String service() {
		page = PageHelper.generatePage();
		customerService.findServiceByPage(page);
		log.info(JSONArray.fromObject(page.getList()));
		return "service";
	}

	public String drain() {
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

}
