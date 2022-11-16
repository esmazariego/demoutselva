package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PetDto {
	
	@JsonProperty("message")
	String message;
	
	@JsonProperty("status")
	String status;
	
	@Override
	public String toString() {
		return "PetDto [message=" + message + ", status=" + status + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
