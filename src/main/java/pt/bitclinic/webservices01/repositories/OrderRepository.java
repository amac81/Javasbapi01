package pt.bitclinic.webservices01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.bitclinic.webservices01.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
