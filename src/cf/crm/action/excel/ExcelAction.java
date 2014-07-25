/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.action.excel;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseExcelAction;
import cf.crm.action.util.Poi;
import cf.crm.service.CustomerService;
import cf.crm.util.page.Page;
import cf.crm.util.page.PageHelper;

@Controller
@Scope("prototype")
public class ExcelAction extends BaseExcelAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1848260491773528799L;
	@Autowired
	@Qualifier("customerServiceImpl")
	private CustomerService customerService;
	private String excelName;
	private InputStream excelStream;
	private Page page;

	public String contribution() throws IOException {
		if (page == null)
			page = PageHelper.generatePage();
		customerService.findContributionByPage(page);
		Poi poi = new Poi();
		poi.createExcel();
		poi.fromStringArray(page.getList(), new String[] { "客户名称", "订单金额（元）" });
		excelName = "客户贡献分析.xlsx";
		excelStream = poi.toInputStream();
		return SUCCESS;
	}

	public InputStream getExcelStream() {
		return excelStream;
	}

	public void setExcelStream(InputStream excelStream) {
		this.excelStream = excelStream;
	}

	public String getExcelName() {
		return excelName;
	}

	public void setExcelName(String excelName) {
		this.excelName = excelName;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
}
