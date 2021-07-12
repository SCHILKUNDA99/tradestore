package com.deutsche.tradestore.onlinetradestore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deutsche.tradestore.onlinetradestore.entity.Trade;
import com.deutsche.tradestore.onlinetradestore.model.TradeVO;
import com.deutsche.tradestore.onlinetradestore.repository.TradeRepository;
import com.deutsche.tradestore.onlinetradestore.service.util.Helper;

/*
 * This Service provided implementations to handle Trade Entity.
 * It interacts with the DB and performs CRUD operations 
*/

@Service
public class TradeServiceImpl implements TradeService{
	
	@Autowired
	private TradeRepository tradeRepository;
	
	
	/*
	 * This method in service is used to persist trades.
	 */
	@Override
	@Transactional
	public TradeVO persistTrade(TradeVO tradeVO) {
		Trade trade = new Trade();
				
		//Populate the values from the VO
		Helper.populateEntity(tradeVO,trade);
		
		//Persist the entity
		trade = tradeRepository.save(trade);
		
		//Populate the VO back with updated DB data and return to caller
		Helper.populateVO(tradeVO,trade);
		return tradeVO;
	}
	
	

	
}
