package pt.bitclinic.webservices01.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.bitclinic.webservices01.entities.User;

@RestController	
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User user = new User(1L, "Arnaldo Canelas", "arnaldo@gmail.com", "123456", "abcd123");
		
		return ResponseEntity.ok().body(user);
			
	}
}
