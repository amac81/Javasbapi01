package pt.bitclinic.webservices01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.bitclinic.webservices01.entities.Product;
import pt.bitclinic.webservices01.exceptions.DBException;
import pt.bitclinic.webservices01.repositories.ProductRepository;

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
			throw new DBException("Product with Id [" + id + "] not found.");
		}
	}
	
	public void add(Product Product) {
		productRepository.save(Product);
	}
	

}