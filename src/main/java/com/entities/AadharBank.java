package com.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@DynamicInsert
@DynamicUpdate
public class AadharBank {
	
	@Id
	private String iinno;
	private int activeFlag;
	private String bankName;
	private String details;
	private String remarks;
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
	private Date timestamp;

	public String getIinno() {
		return iinno;
	}

	public void setIinno(String iinno) {
		this.iinno = iinno;
	}

	public int getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
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

	public AadharBank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
