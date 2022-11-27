package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> validationExceptionHandler(MethodArgumentNotValidException e){
		
		ErrorDetails er = new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(e.getBindingResult().getFieldError().getDefaultMessage());
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}

	
	@ExceptionHandler(AdminException.class)
	public ResponseEntity<ErrorDetails> adminExceptionHandler(AdminException ae, WebRequest wr){
		
		ErrorDetails er = new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(ae.getMessage());
		er.setDesc(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(LoginException.class)
	public ResponseEntity<ErrorDetails> loginExceptionHandler(LoginException e, WebRequest wr){
		
		ErrorDetails er = new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<ErrorDetails> productExceptionHandler(ProductException e, WebRequest wr){
		
		ErrorDetails er = new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(OrderException.class)
	public ResponseEntity<ErrorDetails> orderExceptionHandler(OrderException e, WebRequest wr){
		
		ErrorDetails er = new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<ErrorDetails> customerExceptionHandler(CustomerException e, WebRequest wr){
		
		ErrorDetails er = new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(CategoryException.class)
	public ResponseEntity<ErrorDetails> categoryExceptionHandler(CategoryException e, WebRequest wr){
		
		ErrorDetails er = new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(CartException.class)
	public ResponseEntity<ErrorDetails> cartExceptionHandler(CartException e, WebRequest wr){
		
		ErrorDetails er = new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(BillException.class)
	public ResponseEntity<ErrorDetails> billExceptionHandler(BillException e, WebRequest wr){
		
		ErrorDetails er = new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ErrorDetails> nullPointerExceptionHandler(NullPointerException e, WebRequest wr){
		
		ErrorDetails er=new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorDetails> noHandlerFoundException(NoHandlerFoundException e, WebRequest wr){
		
		ErrorDetails er=new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> masterExceptionHandler(Exception e, WebRequest wr){
		
		ErrorDetails er=new ErrorDetails();
		er.setDateAndTime(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDesc(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetails>(er, HttpStatus.BAD_REQUEST);
		
	}
	
	

}
