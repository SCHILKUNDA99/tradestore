package com.deutsche.tradestore.onlinetradestore.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.deutsche.tradestore.onlinetradestore.model.ErrorResponse;

/*
 * Exception Handler to handle the various exceptions thrown by the application and return a custom response object.
 */

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler{
	
	private static Logger log = LoggerFactory.getLogger(ApplicationExceptionHandler.class);
	
	//Exception Handler for all Generic exceptions
	@ExceptionHandler(Exception.class)
	protected ResponseEntity<Object> handleGenericException(Exception ex)	{
		log.error("Unexpected error occured during the processing of trade",ex);
		return new ResponseEntity<>(new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),"An unexpected error occurred. Please try after some time."),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		return new ResponseEntity<>(new ErrorResponse(HttpStatus.BAD_REQUEST.value(),HttpStatus.BAD_REQUEST.getReasonPhrase(),ex.getBindingResult().toString()),HttpStatus.BAD_REQUEST);
	}
	

}
