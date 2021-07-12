package com.deutsche.tradestore.onlinetradestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deutsche.tradestore.onlinetradestore.entity.Trade;
import com.deutsche.tradestore.onlinetradestore.entity.TradeId;

/*
 * This is the JPA Repository for the Trade data store
 */

@Repository
public interface TradeRepository extends JpaRepository<Trade, TradeId> {
	
		

}
