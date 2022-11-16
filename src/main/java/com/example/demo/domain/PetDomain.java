package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PetDomain {
	
	@JsonProperty("imagen")
	String message;
	
	@JsonProperty("estatus")
	String status;

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
