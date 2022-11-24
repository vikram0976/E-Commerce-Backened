package com.masai.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
public class Address {
	
	private Integer addressId;
	private String city;
	private String state;
	private String country;
	private String pincode;
	

}
