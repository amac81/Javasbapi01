package pt.bitclinic.webservices01.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import pt.bitclinic.webservices01.entities.User;
import pt.bitclinic.webservices01.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		//tb_user seed with test data
		User user1 = new User(null, "Mary Jane", "mary@gmail.com", "99992222", "233332");
		User user2 = new User(null, "Bob Marley", "bob@gmail.com", "92231122", "112222");
		User user3 = new User(null, "George Lucas", "georger@gmail.com", "93555555", "1dde222");
		
		userRepository.saveAll(Arrays.asList(user1, user2, user3));
		
	}

}
