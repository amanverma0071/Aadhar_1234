package com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name="bankDetails")
public class BankListDetails {
	
	private int id;
	private int activeflag;
	private String bankName;
	private String details;
	private String remarks;
	
	@JsonFormat(pattern="dd/mm/yyyy HH:mm:ss")
	private Date timestamp;
	
	@Id
	private String iinno;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActiveflag() {
		return activeflag;
	}

	public void setActiveflag(int activeflag) {
		this.activeflag = activeflag;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getIinno() {
		return iinno;
	}

	public void setIinno(String iinno) {
		this.iinno = iinno;
	}

	public BankListDetails(int id, int activeflag, String bankName, String details, String remarks, Date timestamp,
			String iinno) {
		super();
		this.id = id;
		this.activeflag = activeflag;
		this.bankName = bankName;
		this.details = details;
		this.remarks = remarks;
		this.timestamp = timestamp;
		this.iinno = iinno;
	}

	public BankListDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
