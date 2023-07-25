package pt.bitclinic.javasbws01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.bitclinic.javasbws01.entities.Payment;
import pt.bitclinic.javasbws01.repositories.PaymentRepository;
import pt.bitclinic.javasbws01.services.exceptions.ResourceNotFoundException;

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
			throw new ResourceNotFoundException("payment with Id [" + id + "] not found.");
		}
	}
	
	//TODO PaymentService: insert, delete and update methods
	

}
