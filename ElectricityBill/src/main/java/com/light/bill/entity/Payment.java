package com.light.bill.entity;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Id;
@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int payId;
	private String payMode;
	private String payStatus;
	
	
	@OneToOne
	Bill bill;

	public Payment() {}
	
	

	public Payment(int payId, String payMode, String payStatus, Bill bill) {
		super();
		this.payId = payId;
		this.payMode = payMode;
		this.payStatus = payStatus;
		this.bill = bill;
	}



	
	public int getPayId() {
		return payId;
	}



	public void setPayId(int payId) {
		this.payId = payId;
	}



	public String getPayMode() {
		return payMode;
	}



	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}



	public String getPayStatus() {
		return payStatus;
	}



	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}







	public Bill getBill() {
		return bill;
	}



	public void setBill(Bill bill) {
		this.bill = bill;
	}



	@Override
	public String toString() {
		return "Payment [payId=" + payId + ", payMode=" + payMode + ", payStatus=" + payStatus + ", bill=" + bill + "]";
	}
}
	

