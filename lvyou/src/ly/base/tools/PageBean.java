package ly.base.tools;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {
	
	// 当前页数
	private int currentPage;
	
	// 当前页面显示条数
	private int currentCount;
	
	// 总页数
	private int totalPage;
	
	// 总条数
	private int totalCount;
	
	// 每页显示的数据= new ArrayList<T>()
	private List<T> products ;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getCurrentCount() {
		return currentCount;
	}

	public void setCurrentCount(int currentCount) {
		this.currentCount = currentCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<T> getProducts() {
		return products;
	}

	public void setProducts(List<T> products) {
		this.products = products;
	}
	
}
