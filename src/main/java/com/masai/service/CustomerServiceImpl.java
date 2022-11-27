package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CustomerException;
import com.masai.model.Cart;
import com.masai.model.Customer;
import com.masai.model.Order;
import com.masai.repository.CartRepo;
import com.masai.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	private CustomerRepo cr;
	
	@Autowired
	private CartRepo cartR;

	@Override
	public Customer registerCustomer(Customer customer) throws CustomerException {
		Customer saved = cr.save(customer);
		Cart cart=new Cart();
		cart.setCustomer(saved);
		cartR.save(cart);
		customer.setCart(cart);
		return saved;
	}

	@Override
	public Customer viewCustomer(int customerId) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer, String key) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer deleteCustomer(int customerId, String key) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> viewOrders(int customerId, String key) throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

}
