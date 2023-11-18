package com.light.bill.repository;

import org.springframework.data.repository.CrudRepository;


import com.light.bill.entity.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

	Payment findById = null;

	
	
	
}
