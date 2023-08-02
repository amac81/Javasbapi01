package pt.bitclinic.javasbws01.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeResource {

   @GetMapping
   public String getWelcomeMessage() {
       return "Welcome to my Web services com Spring Boot e JPA / Hibernate!";
   }
}