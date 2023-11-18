package com.light.bill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.light.bill.entity.Bill;
import com.light.bill.entity.Consumer;
import com.light.bill.exception.BillNotFoundException;
import com.light.bill.service.BillService;
import com.light.bill.service.ConsumerService;

@RestController
public class BillController {

	@Autowired
	BillService  billService;
  
	@PostMapping("/addBill")
    public String addBill(@RequestBody Bill bill) {
	System.out.println("In add Bill:"+bill);
	return billService.addBill(bill);
	}
	
	@GetMapping("/getBill/{billId}")
	   public Bill getbill(@PathVariable int billId) throws BillNotFoundException {
			return billService.getBill(billId);
		}
	 
	   @PutMapping("/upadteBill/{billId}")
	   public String updateConsumer(@PathVariable int billId, @RequestBody Bill newBill) {
			return billService.updateBill(billId, newBill);
		}
}
