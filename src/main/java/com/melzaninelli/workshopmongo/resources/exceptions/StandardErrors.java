package com.melzaninelli.workshopmongo.resources.exceptions;

import java.io.Serializable;

public class StandardErrors implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private Long timestamp;
	private Integer status;
	private String error;
	private String path;
	
	public StandardErrors() {
		
	}
	
	public StandardErrors(Long timestamp, Integer status, String error, String path) {
		super();
		this.setTimestamp(timestamp);
		this.setStatus(status);
		this.setError(error);
		this.setPath(path);
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
