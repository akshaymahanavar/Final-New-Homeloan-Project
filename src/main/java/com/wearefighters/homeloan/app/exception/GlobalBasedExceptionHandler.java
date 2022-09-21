package com.wearefighters.homeloan.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalBasedExceptionHandler {
	@ExceptionHandler(DataNotsavedException.class)
	public ResponseEntity<String> dataNotsavedException(DataNotsavedException d){
		System.out.println("handle exception globally");
		return new ResponseEntity<String>(d.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<String> dataNotfoundException(DataNotFoundException e){
		System.out.println("handle exception globally");
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_GATEWAY);
	} 
	
}
