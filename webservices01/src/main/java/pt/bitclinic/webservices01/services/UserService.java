package pt.bitclinic.webservices01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.bitclinic.webservices01.entities.User;
import pt.bitclinic.webservices01.repositories.UserRepository;
import pt.bitclinic.webservices01.services.exceptions.DatabaseException;
import pt.bitclinic.webservices01.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional(readOnly = true)	
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Transactional(readOnly = true)	
	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(()->  new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			userRepository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
		catch(DataIntegrityViolationException e1) {
			throw new DatabaseException(e1.getMessage());		
		}
	}

	public User update(Long id, User obj) {
		//getReferenceById more efficient than findById
		//getReferenceById only "prepares" the monitored object 
		User entity = userRepository.getReferenceById(id);
		updateData(entity, obj);
		return userRepository.save(entity);
	}
	
	private void updateData(User entity, User obj) {
		//id and password not allowed to update
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
