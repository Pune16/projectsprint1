package com.light.bill.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.light.bill.entity.Bill;

public interface BillRepository extends CrudRepository<Bill, Integer>{

	Bill save(int id);
	

}
