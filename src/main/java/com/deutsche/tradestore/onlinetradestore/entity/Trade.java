package com.deutsche.tradestore.onlinetradestore.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/*
 * Entity Object holding the Entity data for Trade table
 */
@Entity
public class Trade implements Serializable{

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private TradeId id;
	private String counterpartyId;
	private String bookId;
	private LocalDate maturityDate;
	private LocalDate createdDate;
	private boolean expired;
	
	/**
	 * 
	 */
	public Trade() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param counterpartyId
	 * @param bookId
	 * @param maturityDate
	 * @param createdDate
	 * @param expired
	 */
	public Trade(TradeId id, String counterpartyId, String bookId, LocalDate maturityDate, LocalDate createdDate,
			boolean expired) {
		this.id = id;
		this.counterpartyId = counterpartyId;
		this.bookId = bookId;
		this.maturityDate = maturityDate;
		this.createdDate = createdDate;
		this.expired = expired;
	}
	
	/**
	 * @return the id
	 */
	public TradeId getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(TradeId id) {
		this.id = id;
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
	 * @return the createdDate
	 */
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the expired
	 */
	public boolean isExpired() {
		return expired;
	}
	/**
	 * @param expired the expired to set
	 */
	public void setExpired(boolean expired) {
		this.expired = expired;
	}
	
}
