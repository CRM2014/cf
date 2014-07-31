/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.action.data;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cf.crm.action.BaseAction;
import cf.crm.dao.support.adapter.page.Page;
import cf.crm.dao.support.adapter.page.PageHelper;
import cf.crm.entity.Product;
import cf.crm.service.ProductService;

@Controller
@Scope("prototype")
public class ProductAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7092525820960752010L;

	@Autowired
	@Qualifier("productServiceImpl")
	private ProductService ProductService;
	private Page<Product> page;

	private Product product;
	private Product condition;
	
	
	@SuppressWarnings("unchecked")
	public String list(){
		if (page == null)
			page = PageHelper.generatePage();
		Map<String, Object> like = null;
		if (condition != null) {
			like = new HashMap<String, Object>();
			if (condition.getPrModel()!= null
					&& !"".equals(condition.getPrModel()))
				like.put("prModel", condition.getPrModel());
			if (condition.getPrName() != null
					&& !"".equals(condition.getPrName()))
				like.put("prName", condition.getPrName());
		}
		ProductService.findByPage(page, like);
		return "list";
	}
	
	
	public String depot(){
		return "depot";
	}
	public String init(){
		return "init";
	}
	
	public Product getCondition() {
		return condition;
	}

	public void setCondition(Product condition) {
		this.condition = condition;
	}

	public Page<Product> getPage() {
		return page;
	}

	public void setPage(Page<Product> page) {
		this.page = page;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	

}
