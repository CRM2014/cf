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

import java.util.List;

public class Page<T> {
	private int currentPage;
	private int pageSize;
	private boolean isDesc;
	private String order;
	private List<T> list;
	private int count;
	private int countPage;

	Page() {
	}

	public int getFirstRec() {
		if (pageSize == 0)
			return 0;
		else
			return (currentPage - 1) * pageSize;
	}

	public int getCountPage() {
		if (pageSize == 0)
			countPage = 1;
		else if (count % pageSize == 0)
			countPage = count / pageSize;
		else
			countPage = count / pageSize + 1;
		return countPage;
	}

	public int getCurrentPage() {
		if (currentPage > getCountPage())
			currentPage = 1;
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public boolean isDesc() {
		return isDesc;
	}

	public void setDesc(boolean isDesc) {
		this.isDesc = isDesc;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
