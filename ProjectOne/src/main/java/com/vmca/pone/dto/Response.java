package com.vmca.pone.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
	
	private String page;
	private String per_page;
	private String total;
	private String total_pages;
	private List<User> data;
	private Support support;
	/**
	 * @return the page
	 */
	public String getPage() {
		return page;
	}
	/**
	 * @param page the page to set
	 */
	public void setPage(String page) {
		this.page = page;
	}
	/**
	 * @return the per_page
	 */
	public String getPer_page() {
		return per_page;
	}
	/**
	 * @param per_page the per_page to set
	 */
	public void setPer_page(String per_page) {
		this.per_page = per_page;
	}
	/**
	 * @return the total
	 */
	public String getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(String total) {
		this.total = total;
	}
	/**
	 * @return the total_pages
	 */
	public String getTotal_pages() {
		return total_pages;
	}
	/**
	 * @param total_pages the total_pages to set
	 */
	public void setTotal_pages(String total_pages) {
		this.total_pages = total_pages;
	}
	/**
	 * @return the data
	 */
	public List<User> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<User> data) {
		this.data = data;
	}
	/**
	 * @return the support
	 */
	public Support getSupport() {
		return support;
	}
	/**
	 * @param support the support to set
	 */
	public void setSupport(Support support) {
		this.support = support;
	}
	
	

}
