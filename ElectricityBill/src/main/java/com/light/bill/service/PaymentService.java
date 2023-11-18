package com.light.bill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.light.bill.entity.Payment;
import com.light.bill.repository.BillRepository;
import com.light.bill.repository.ConsumerRepository;
import com.light.bill.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	@Autowired
	BillRepository billRepository;
	


	public String addPayment(Payment payment) {
		Payment P1= paymentRepository.save(payment);
		//int billId = payment.getBill().getBillId();
		//billRepository.findById(billId).get();
		
		//if(P1 != null)
			return "Payment "+P1.getPayId()+ "Payment Mode"+P1.getPayMode()+ "Payment Status"+P1.getPayStatus()+"BillId"+payment.getBill()+ "Successfully created";
		//else
		  //  return null;
	}
	
	public  Payment getPayment(int payId) {
		Payment P1 = ((Payment) paymentRepository.findById(payId).get());
		return P1;
	}

	public String updatePayment(int payId, Payment newPayment) {
		Payment P1= paymentRepository.findById(payId).get();
		P1 = paymentRepository.save(P1);
		
		if(P1 != null)
			return "Payment "+P1.getPayId() +", "+P1.getPayMode()+"Payment Status"+ P1.getPayStatus()+ "Successfully Updated";
		else
		return null;
	}


}