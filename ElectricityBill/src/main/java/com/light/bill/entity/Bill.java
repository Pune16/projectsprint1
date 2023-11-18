package com.light.bill.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Id;

@Entity
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billId;
	private String billDescription;
	private int noOfUnit;
;
	
	@ManyToOne 
	Consumer consumer;

	
	public Bill(){}
	
	

	public Bill(int billId, String billDescription, int noOfUnit, Consumer consumer) {
		super();
		this.billId = billId;
		this.billDescription = billDescription;
		this.noOfUnit = noOfUnit;
		this.consumer = consumer;
	}

	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public String getBillDescription() {
		return billDescription;
	}
	public void setBillDescription(String billDescription) {
		this.billDescription = billDescription;
	}
	public int getNoOfUnit() {
		return noOfUnit;
	}
	public void setNoOfUnit(int noOfUnit) {
		this.noOfUnit = noOfUnit;
	}
	public Consumer getConsumer() {
		return consumer;
	}
	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", billDescription=" + billDescription + ", noOfUnit=" + noOfUnit
				+ ", consumer=" + consumer + "]";
	}
}
	