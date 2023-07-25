package pt.bitclinic.javasbws01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.bitclinic.javasbws01.entities.User;

//we don't need to implement this interface, because springframework.data.jpa 
//already has a default implementation for this specific type <User, Long>

//@Repository optional (JpaRepository is already registered as a Spring component) 
public interface UserRepository extends JpaRepository<User, Long> {

}
