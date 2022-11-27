package com.masai.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorDetails {

	private LocalDateTime dateAndTime;
	private String message;
	private String desc;
	
}
