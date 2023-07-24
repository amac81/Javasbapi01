package pt.bitclinic.webservices01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.bitclinic.webservices01.entities.Category;
import pt.bitclinic.webservices01.exceptions.DBException;
import pt.bitclinic.webservices01.repositories.CategoryRepository;

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
			throw new DBException("Category with Id [" + id + "] not found.");
		}
	}
	
	public void add(Category Category) {
		categoryRepository.save(Category);
	}
	

}