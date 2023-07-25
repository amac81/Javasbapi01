package pt.bitclinic.webservices01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityNotFoundException;
import pt.bitclinic.webservices01.entities.Product;
import pt.bitclinic.webservices01.repositories.ProductRepository;
import pt.bitclinic.webservices01.services.exceptions.DatabaseException;
import pt.bitclinic.webservices01.services.exceptions.ResourceNotFoundException;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Transactional(readOnly = true)	
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Transactional(readOnly = true)	
	public Product findById(Long id) {

		Optional<Product> optionalProduct = productRepository.findById(id);
				
		if (optionalProduct.isPresent()) {
			Product Product = optionalProduct.get();
			return Product;
		} else {
			throw new ResourceNotFoundException("Product with Id [" + id + "] not found.");
		}
	}
		
	public Product insert(Product obj) {
		return productRepository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			productRepository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
		catch(DataIntegrityViolationException e1) {
			throw new DatabaseException(e1.getMessage());		
		}
	}

	public Product update(Long id, Product obj) {
		try {
			//getReferenceById more efficient than findById
			//getReferenceById only "prepares" the monitored object 
			Product entity = productRepository.getReferenceById(id);
			updateData(entity, obj);
			return productRepository.save(entity);
			
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}	
	}
	
	private void updateData(Product entity, Product obj) {		
		entity.setName(obj.getName());
		entity.setDescription(obj.getDescription());
		entity.setPrice(obj.getPrice());
		entity.setImgUrl(obj.getImgUrl());
	}
	

}
