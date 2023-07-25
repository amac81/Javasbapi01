package pt.bitclinic.javasbws01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityNotFoundException;
import pt.bitclinic.javasbws01.entities.Category;
import pt.bitclinic.javasbws01.repositories.CategoryRepository;
import pt.bitclinic.javasbws01.services.exceptions.DatabaseException;
import pt.bitclinic.javasbws01.services.exceptions.ResourceNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Transactional(readOnly = true)	
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Transactional(readOnly = true)	
	public Category findById(Long id) {

		Optional<Category> optionalCategory = categoryRepository.findById(id);
				
		if (optionalCategory.isPresent()) {
			Category Category = optionalCategory.get();
			return Category;
		} else {
			throw new ResourceNotFoundException("Category with Id [" + id + "] not found.");
		}
	}
		
	public Category insert(Category obj) {
		return categoryRepository.save(obj);
	}

	public void delete(Long id) {
		try {
			categoryRepository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
		catch(DataIntegrityViolationException e1) {
			throw new DatabaseException(e1.getMessage());		
		}
	}
	
	public Category update(Long id, Category obj) {
		try {
			//getReferenceById more efficient than findById
			//getReferenceById only "prepares" the monitored object 
			Category entity = categoryRepository.getReferenceById(id);
			
			entity.setName(obj.getName());
			
			return categoryRepository.save(entity);
			
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}	
	}
	
}
