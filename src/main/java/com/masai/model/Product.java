package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer prodId;
	private String prodName;
	
	@OneToOne(cascade = CascadeType.ALL)
	Category category;
	
	private Integer quantity;
	private Integer price;
	private Integer soldCount;
	private Integer rating;
	private String description;
	

	
}
