package pt.bitclinic.javasbws01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityNotFoundException;
import pt.bitclinic.javasbws01.entities.Order;
import pt.bitclinic.javasbws01.repositories.OrderRepository;
import pt.bitclinic.javasbws01.services.exceptions.DatabaseException;
import pt.bitclinic.javasbws01.services.exceptions.ResourceNotFoundException;

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
			throw new ResourceNotFoundException("Order with Id [" + id + "] not found.");
		}
	}
		
	public Order insert(Order obj) {
		return orderRepository.save(obj);
	}

	public void delete(Long id) {
		try {
			orderRepository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
		catch(DataIntegrityViolationException e1) {
			throw new DatabaseException(e1.getMessage());		
		}
	}
	
	public Order update(Long id, Order obj) {
		try {
			//getReferenceById more efficient than findById
			//getReferenceById only "prepares" the monitored object 
			Order entity = orderRepository.getReferenceById(id);
			updateData(entity, obj);
			return orderRepository.save(entity);
			
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}	
	}
	
	private void updateData(Order entity, Order obj) {
		entity.setMoment(obj.getMoment());
		entity.setOrderStatus(obj.getOrderStatus());
		entity.setUser(obj.getUser());
	}
}
