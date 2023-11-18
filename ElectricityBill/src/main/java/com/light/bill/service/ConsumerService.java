package com.light.bill.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.light.bill.entity.Bill;
import com.light.bill.entity.Consumer;
import com.light.bill.entity.Payment;
import com.light.bill.exception.ConsumerNotFoundException;
import com.light.bill.entity.Consumer;
import com.light.bill.repository.ConsumerRepository;

@Service
public class ConsumerService {

	
	@Autowired
	ConsumerRepository consumerRepository;
	
	public String addConsumer(Consumer consumer) {

		Consumer C1= consumerRepository.save(consumer);
		if(C1 != null) 
			return "ConsumerId "+C1.getId() +"CosumerName "+ C1.getName()+"Cosumer Password "+ C1.getPassword()+"Cosumer address "+ C1.getAddress()+"CosumerEmail "+ C1.getEmail()+"Successfully created";
		else
			return null;
	}

	public Consumer getConsumer(int id) throws  ConsumerNotFoundException{
		
		Consumer consumer =null;
		try {
			consumer = consumerRepository.findById(id).get();
		}
		catch(NoSuchElementException ex) {
			throw new ConsumerNotFoundException("Consumer not found with id " +id);
		}
		return consumer;
	}
	
	public String upadateConsumer(int id, Consumer newConsumer) {
		Consumer C1=consumerRepository.findById(id).get();
		C1.setName(newConsumer.getName());
		 C1= consumerRepository.save(C1);
		if(C1 != null) 
			return "ConsumerId "+C1.getId() +"CosumerName "+ C1.getName()+"Cosumer Password "+ C1.getPassword()+"Cosumer address "+ C1.getAddress()+"CosumerEmail "+ C1.getEmail()+"Successfully created";
		else
			return null;
	}

}
