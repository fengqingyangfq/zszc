package com.yu.util;

import java.util.List;


public class Page {

	
	private int currentPage=1;		//当前页
	private int totalPage;			//总页数
	private int allItems;			//总记录数
	private int pageItems=2;			//每页显示数
	private List pageData; // 每个页面的数据结果集
	public Page(){
		
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getAllItems() {
		return allItems;
	}
	public void setAllItems(int allItems) {
		this.allItems = allItems;
		if (this.allItems % this.pageItems == 0)
			totalPage = this.allItems / this.pageItems;
		else
			totalPage = this.allItems / this.pageItems + 1;
	}
	public int getPageItems() {
		return pageItems;
	}
	public void setPageItems(int pageItems) {
		this.pageItems = pageItems;
	}

	public List getPageData() {
		return pageData;
	}

	public void setPageData(List pageData) {
		this.pageData = pageData;
	}
	
}
