package com.masai.service;

import java.time.LocalDate;
import java.util.List;

import com.masai.exception.BillException;
import com.masai.exception.OrderException;
import com.masai.model.Bill;


public interface BillService {
	

	public Bill addBill(Bill bill, int orderId) throws BillException, OrderException;
	
	public Bill viewBill(int billId)throws BillException;
	
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate)throws BillException;
	
	public Bill updateBill(Bill bill)throws BillException;
	
	public Bill removeBill(int billId)throws BillException;
	

}
