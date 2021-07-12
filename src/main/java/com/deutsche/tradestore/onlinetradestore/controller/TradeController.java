/**
 * 
 */
package com.deutsche.tradestore.onlinetradestore.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deutsche.tradestore.onlinetradestore.model.TradeServiceResponse;
import com.deutsche.tradestore.onlinetradestore.model.TradeVO;
import com.deutsche.tradestore.onlinetradestore.service.TradeService;

/**
 * This is the rest controller for accepting and orchestrating various operations on 
 * Trade data store
 */

@RestController
public class TradeController {

	@Autowired
	private TradeService tradeService;
	
	/*
	 * This method handles the post requests for persisting trades
	 */
	@PostMapping("/trades")
	public ResponseEntity<TradeServiceResponse> postTrade(@Valid @RequestBody TradeVO tradeVO)	{
		tradeVO = tradeService.persistTrade(tradeVO);	
		return new ResponseEntity<TradeServiceResponse>(new TradeServiceResponse("Trade saved successfully"),HttpStatus.CREATED);
	}
	
}
