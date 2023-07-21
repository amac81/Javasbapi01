package pt.bitclinic.webservices01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.bitclinic.webservices01.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
