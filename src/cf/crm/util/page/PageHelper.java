/** 
 * <p>Copyright® 2014 CodeFactory版权所有。</p> 
 */

/** 
 * <h2>控制器基础类<h2> 
 *
 * @author 齐宇 
 * @version 1.0, 2014-7-15 
 */

package cf.crm.util.page;

public class PageHelper {
	@SuppressWarnings("rawtypes")
	public static Page generatePage() {
		Page<?> page = new Page<>();
		page.setDesc(true);
		page.setPageSize(10);
		page.setCurrentPage(1);
		page.setCount(0);
		page.setOrder(null);
		page.setList(null);
		return page;
	}
}
