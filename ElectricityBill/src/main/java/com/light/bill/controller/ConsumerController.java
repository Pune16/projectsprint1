package com.light.bill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.light.bill.*;
import com.light.bill.entity.Consumer;
import com.light.bill.exception.ConsumerNotFoundException;
import com.light.bill.service.ConsumerService;

import jakarta.validation.Valid;

@RestController
public class ConsumerController {
	
	@Autowired
	ConsumerService  consumerService;
  
   
	@PostMapping("/addConsumer")
    public String addConsumer(@Valid @RequestBody Consumer consumer) {
	System.out.println("In add Consumer:"+consumer);
	
	return consumerService.addConsumer(consumer);
	}
   
   @GetMapping("/getConsumer/{id}")
   public Consumer getConsumer(@PathVariable int id) throws ConsumerNotFoundException {
		
	   return  consumerService.getConsumer(id);
	}
   
   @PutMapping("/upadateConsumer/{id}")
   public String upadateConsumer(@PathVariable int id, @RequestBody Consumer newConsumer) {
		return consumerService.upadateConsumer(id, newConsumer);
	}
}
