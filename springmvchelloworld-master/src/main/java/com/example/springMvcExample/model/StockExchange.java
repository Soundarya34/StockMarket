package com.example.springMvcExample.model;

public class StockExchange {

	private int stockExchangeId;
	private String stockExchangeName;
	private String brief;
	private String contactAddress;
	private String remarks;
	public int getstockExchangeId() {
		return stockExchangeId;
	}
	public void setstockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}
	
	public String getStockExchangeName() {
		return stockExchangeName;
	}
	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "\n"+"stockExchangeId=" + stockExchangeId + ", stockExchangeName=" + stockExchangeName
				+ ", brief=" + brief + ", contactAddress=" + contactAddress + ", remarks=" + remarks ;
	}
	
	
	
	
}
