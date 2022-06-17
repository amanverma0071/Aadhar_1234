package com.entities;

import java.util.List;

public class Bank {

	private boolean status;
	
	private String message;
	
	private List<AadharBank> data;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<AadharBank> getData() {
		return data;
	}

	public void setData(List<AadharBank> data) {
		this.data = data;
	}
}
