package com.uls.caroccupationtool.model.response;

import java.util.Date;

public class ErrorMessageResponse {

	private Date timestamp;
	private String msg;
	
	public ErrorMessageResponse(Date timestamp, String msg) {
		this.timestamp = timestamp;
		this.msg = msg;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
