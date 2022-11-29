package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


@Entity
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	
	@NotNull
	private String productName;
	
	private Integer quantity;
	private Integer price;
	private Integer soldCount;
	private Integer rating;
	private String description;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private Category category;

	
}
