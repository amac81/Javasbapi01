package pt.bitclinic.webservices01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.bitclinic.webservices01.entities.Payment;
import pt.bitclinic.webservices01.exceptions.DBException;
import pt.bitclinic.webservices01.repositories.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	@Transactional(readOnly = true)	
	public List<Payment> findAll() {
		return paymentRepository.findAll();
	}

	@Transactional(readOnly = true)	
	public Payment findById(Long id) 
	{

		Optional<Payment> optionalpayment = paymentRepository.findById(id);
				
		if (optionalpayment.isPresent()) {
			Payment payment = optionalpayment.get();
			return payment;
		} else {
			throw new DBException("payment with Id [" + id + "] not found.");
		}
	}
	
	public void add(Payment payment) {
		paymentRepository.save(payment);
	}
	

}
