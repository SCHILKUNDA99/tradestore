package com.deutsche.tradestore.onlinetradestore.service.util;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;

import com.deutsche.tradestore.onlinetradestore.entity.Trade;
import com.deutsche.tradestore.onlinetradestore.entity.TradeId;
import com.deutsche.tradestore.onlinetradestore.model.TradeVO;

/*
 * This is the utility class for all the Services.
*/
public class Helper {
	
	/*
	 * Utility method to load the entity Object for persistence
	 */
	public static void populateEntity(TradeVO tradeVO,Trade trade)	{
		BeanUtils.copyProperties(tradeVO, trade);
		TradeId tradeId = new TradeId(tradeVO.getTradeId(),tradeVO.getVersion());;
		trade.setId(tradeId);
		trade.setCreatedDate(LocalDate.now());
		if(trade.getMaturityDate().isBefore(LocalDate.now())) {
			trade.setExpired(true);
		}
	}
	
	/*
	 * Utility method to load the Vo object from stored entity.
	 */
	public static void populateVO(TradeVO tradeVO, Trade trade) {
		BeanUtils.copyProperties(trade, tradeVO);
		tradeVO.setTradeId(trade.getId().getTradeId());
		tradeVO.setVersion(trade.getId().getVersion());
	}

}
