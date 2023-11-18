package com.light.bill.repository;

import org.springframework.data.repository.CrudRepository;

import com.light.bill.entity.Consumer;

public interface ConsumerRepository extends CrudRepository<Consumer, Integer> {

	Consumer save(int id);

	

	

}
