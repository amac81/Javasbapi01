package pt.bitclinic.webservices01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.bitclinic.webservices01.entities.Order;
import pt.bitclinic.webservices01.exceptions.DBException;
import pt.bitclinic.webservices01.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Transactional(readOnly = true)	
	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	@Transactional(readOnly = true)	
	public Order findById(Long id) {

		Optional<Order> optionalOrder = orderRepository.findById(id);
				
		if (optionalOrder.isPresent()) {
			Order Order = optionalOrder.get();
			return Order;
		} else {
			throw new DBException("Order with Id [" + id + "] not found.");
		}
	}
	
	public Double orderTotal(Long id) {
		return findById(id).total();
	}
	

}
