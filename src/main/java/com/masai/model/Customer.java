package com.masai.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	
	private String name;
	private Integer age;
	private String gender;
	

	@Embedded
	private Address address;
	
	private Integer mobile;
	private String email;
	private Integer password;
	
	@OneToOne(cascade = CascadeType.ALL)
	Cart cart;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Order> order;
	
	
	
}
