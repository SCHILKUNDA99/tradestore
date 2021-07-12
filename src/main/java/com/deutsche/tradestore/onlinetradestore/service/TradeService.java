package com.deutsche.tradestore.onlinetradestore.service;

import com.deutsche.tradestore.onlinetradestore.model.TradeVO;

/*
 * This Service exposes various operations that can be performed on the Trade Store
 * */
public interface TradeService {
	
	/*
	 * Service operation to handle persistence of the trades
	 */
	public TradeVO persistTrade(TradeVO tradeVO);


}
