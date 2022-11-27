package com.masai.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	
	private LocalDateTime orderdate;
	
	private LocalTime orderTime;
	
	private String status;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customer;
	
	@OneToOne
	private Cart cart;

	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	private Bill bill;
	
}
