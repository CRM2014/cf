package cf.crm.util.page;

public class PageHelper {
	public static Page generatePage() {
		Page page = new Page();
		page.setDesc(true);
		page.setPageSize(10);
		page.setCurrentPage(1);
		return page;
	}
}
