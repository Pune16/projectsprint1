package com.light.bill.service;


import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.light.bill.entity.Bill;
import com.light.bill.entity.Consumer;
import com.light.bill.exception.BillNotFoundException;
import com.light.bill.repository.BillRepository;
import com.light.bill.repository.ConsumerRepository;

@Service
public class BillService {

	@Autowired
	BillRepository billRepository;
	
	@Autowired
	ConsumerRepository consumerRepository;
	
	public String addBill(Bill bill) {
		
		Consumer c=consumerRepository.findById(bill.getConsumer().getId()).get();
		Bill B1=billRepository.save(bill);
		
		if(B1 != null)
			return "BillId " +B1.getBillId()+"Bill Description"+B1.getBillDescription()+"Number of Unit"+B1. getNoOfUnit()+"Successfully Created";
					
		else
				
		    return null;
		
	}
	
	public Bill getBill(int billId) throws BillNotFoundException{
		Bill bill=null;
		try {
			bill = billRepository.findById(billId).get();
		}
		catch(NoSuchElementException ex){
			throw new BillNotFoundException("Bill not Found with id" +billId );
		}
		return bill;
	}

	public String updateBill(int id, Bill newBill) {
		Bill B1=billRepository.save(id);
		if(B1 != null)
			return "BillId "+B1.getBillId()+"Bill Description"+B1.getBillDescription()+"Number of units"+B1.getNoOfUnit()+"Successfully Created";
		else
		return null;
	}

}
