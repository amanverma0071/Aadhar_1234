package com.entities;

import java.util.List;

public class BankList {

	private Boolean status;
	private String message;
	private List<BankListDetails> data;
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<BankListDetails> getData() {
		return data;
	}
	public void setData(List<BankListDetails> data) {
		this.data = data;
	}
	public BankList(Boolean status, String message, List<BankListDetails> data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}
	public BankList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
