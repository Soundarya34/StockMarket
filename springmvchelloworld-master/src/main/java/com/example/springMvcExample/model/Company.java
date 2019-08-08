package com.example.springMvcExample.model;

import java.util.List;



public class Company {

	private int comapanyCode;
	private String companyName;
	private double turnover;
	private String ceoName;
	private String boardOfDirectors;
	private List<StockExchange> stockExchange;
	private int sectorId;
	private String writeup;
	private int stockCode;
	
	
	public int getComapanyCode() {
		return comapanyCode;
	}
	public void setComapanyCode(int comapanyCode) {
		this.comapanyCode = comapanyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getTurnover() {
		return turnover;
	}
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOdDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	
	public List<StockExchange> getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(List<StockExchange> stockExchange) {
		this.stockExchange = stockExchange;
	}
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getWriteup() {
		return writeup;
	}
	public void setWriteup(String writeup) {
		this.writeup = writeup;
	}
	public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	@Override
	public String toString() {
		return "\ncompanyCode=" + comapanyCode + ", companyName=" + companyName + ", turnover=" + turnover
				+ ", ceoName=" + ceoName + ", boardOfDirectors=" + boardOfDirectors + ", "
				+ ", sectorId=" + sectorId + ", writeup=" + writeup + ", stockCode=" + stockCode ;
	}
	
	
	
	
}
