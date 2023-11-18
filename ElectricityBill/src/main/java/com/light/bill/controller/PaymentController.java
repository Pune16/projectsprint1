package com.light.bill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.light.bill.entity.Payment;
import com.light.bill.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	
	@PostMapping("/addPayment")
	public String addPayment(@RequestBody Payment payment) {
		System.out.println("In add Payment:" +payment);
		return paymentService.addPayment(payment);
		
	}
	
	 @GetMapping("/getPayment/{id}")
	 public Payment getPayment(@PathVariable int id ) {
		 return paymentService.getPayment(id);
	 }
	
	
	
	@PutMapping("/updatePayment/{id}")
	public String updatePayment(@PathVariable int id,@RequestBody Payment newPayment )
	{
		return paymentService.updatePayment(id,newPayment);
		
		
	}
}
