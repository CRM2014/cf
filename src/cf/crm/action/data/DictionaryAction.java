package cf.crm.action.data;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.entity.Datadictionary;
import cf.crm.entity.User;
import cf.crm.service.DatadictionaryService;
import cf.crm.util.page.Page;
import cf.crm.util.page.PageHelper;

@Controller
@Scope("prototype")
public class DictionaryAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7455431794192088163L;

	@Autowired
	@Qualifier("datadictionaryServiceImpl")
	private DatadictionaryService DatadictionaryService;
	private Page<Datadictionary> page;

	private Datadictionary dictionary;
	private Datadictionary condition;

	@Override
	public String execute() throws Exception {
		return "fail";
	}

	public String add() {
		return "add";
	}

	public String delete() {
		return "delete";
	}

	public String update() {
		return "update";
	}

	public String inquiry() {
		return "inquiry";
	}

	public String list() {
		if (page == null)
			page = PageHelper.generatePage();
		Map<String, Object> like = null;
		if (condition != null) {
			like = new HashMap<String, Object>();
			if (condition.getDadiType() != null
					&& !"".equals(condition.getDadiType()))
				like.put("dadiType", condition.getDadiType());
			if (condition.getDadiValue() != null
					&& !"".equals(condition.getDadiValue()))
				like.put("dadiValue", condition.getDadiValue());
		}
		DatadictionaryService.findByPage(page, like);
		return "list";
	}

	public String addData() {
		System.out.println("===============================================");
		System.out.println(dictionary.getDadiItem());
		System.out.println(dictionary.getDadiType());
		System.out.println(dictionary.getDadiValue());
		System.out.println(dictionary.isDadiEnableEdit());

		return "add-success";
	}

	public Datadictionary getCondition() {
		return condition;
	}

	public void setCondition(Datadictionary condition) {
		this.condition = condition;
	}

	public Page<Datadictionary> getPage() {
		return page;
	}

	public void setPage(Page<Datadictionary> page) {
		this.page = page;
	}

	public Datadictionary getDictionary() {
		return dictionary;
	}

	public void setDictionary(Datadictionary dictionary) {
		this.dictionary = dictionary;
	}

}
