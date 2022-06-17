package com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name="state")
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stateId;
	
	private String state;
	
	private int activeFlag;
	
	private String remarks;
	
	private int sortFlag;
	
	@JsonFormat(pattern="dd/mm/yyyy HH:mm:ss")
	private Date timeStamp;
	
	@JsonFormat(pattern="dd/mm/yyyy HH:mm:ss")
	private Date updateTimeStamp;
	
	private String stateCode;
	
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getSortFlag() {
		return sortFlag;
	}
	public void setSortFlag(int sortFlag) {
		this.sortFlag = sortFlag;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public Date getUpdateTimeStamp() {
		return updateTimeStamp;
	}
	public void setUpdateTimeStamp(Date updateTimeStamp) {
		this.updateTimeStamp = updateTimeStamp;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public State(int stateId, String state, int activeFlag, String remarks, int sortFlag, Date timeStamp,
			Date updateTimeStamp, String stateCode) {
		super();
		this.stateId = stateId;
		this.state = state;
		this.activeFlag = activeFlag;
		this.remarks = remarks;
		this.sortFlag = sortFlag;
		this.timeStamp = timeStamp;
		this.updateTimeStamp = updateTimeStamp;
		this.stateCode = stateCode;
	}
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
