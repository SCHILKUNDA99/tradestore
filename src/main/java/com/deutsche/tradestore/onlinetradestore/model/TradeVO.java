package com.deutsche.tradestore.onlinetradestore.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

/*
 * VO object to hold the data from User to be passed on to Service Layer 
 * And then to carry data back to Controller
 */
public class TradeVO implements Serializable{
	

	private static final long serialVersionUID = 1L;
	@Size(min=2,max=10, message="TradeId should be between 2 to 10 characters")
	private String tradeId;
	@NotNull(message="Version should be not null")
	
	private int version;
	@Size(min=0,max=10, message="CounterPartyId should be between 2 to 10 characters")
	private String counterpartyId;
	@Size(min=0,max=10, message="BookId should be between 2 to 10 characters")
	private String bookId;
	@JsonFormat(pattern ="MM/dd/yyyy")
	private LocalDate maturityDate;
	private boolean newInsert;
	
	/**
	 * No Arg Constructor
	 */
	public TradeVO() {
		
	}
	/**
	 * @param tradeId
	 * @param version
	 * @param counterpartyId
	 * @param bookId
	 * @param maturityDate
	 */
	public TradeVO(String tradeId, int version, String counterpartyId, String bookId, LocalDate maturityDate) {
		this.tradeId = tradeId;
		this.version = version;
		this.counterpartyId = counterpartyId;
		this.bookId = bookId;
		this.maturityDate = maturityDate;
	}
	
	
	/**
	 * @return the tradeId
	 */
	public String getTradeId() {
		return tradeId;
	}
	/**
	 * @param tradeId the tradeId to set
	 */
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}
	/**
	 * @return the counterpartyId
	 */
	public String getCounterpartyId() {
		return counterpartyId;
	}
	/**
	 * @param counterpartyId the counterpartyId to set
	 */
	public void setCounterpartyId(String counterpartyId) {
		this.counterpartyId = counterpartyId;
	}
	/**
	 * @return the bookId
	 */
	public String getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the maturityDate
	 */
	public LocalDate getMaturityDate() {
		return maturityDate;
	}
	/**
	 * @param maturityDate the maturityDate to set
	 */
	public void setMaturityDate(LocalDate maturityDate) {
		this.maturityDate = maturityDate;
	}
	/**
	 * @return the newInsert
	 */
	public boolean isNewInsert() {
		return newInsert;
	}
	/**
	 * @param newInsert the newInsert to set
	 */
	public void setNewInsert(boolean newInsert) {
		this.newInsert = newInsert;
	}

}
