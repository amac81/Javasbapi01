package pt.bitclinic.webservices01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import pt.bitclinic.webservices01.entities.User;
import pt.bitclinic.webservices01.exceptions.DBException;
import pt.bitclinic.webservices01.repositories.UserRepository;

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

		Optional<User> optionalUser = userRepository.findById(id);
				
		if (optionalUser.isPresent()) {
			User user = optionalUser.get();
			return user;
		} else {
			throw new DBException("User with Id [" + id + "] not found.");
		}
	}
	
	public User insert(User user) {
		return userRepository.save(user);
	}
	

}
