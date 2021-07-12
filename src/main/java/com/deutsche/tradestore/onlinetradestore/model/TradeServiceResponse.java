package com.deutsche.tradestore.onlinetradestore.model;

import java.io.Serializable;

/*
 * ServiceResponse for the different operations on Trade Data Store
 */
public class TradeServiceResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	String message;

	/**
	 * @param message
	 */
	public TradeServiceResponse(String message) {
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * No Args Constructor
	 */
	public TradeServiceResponse() {
		
	}
}
