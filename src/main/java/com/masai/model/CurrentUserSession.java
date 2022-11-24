package com.masai.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CurrentUserSession {

	@Id
	private Integer userId;
	
	private String uuid;
	
	private LocalDateTime localDateTime;

	
}
