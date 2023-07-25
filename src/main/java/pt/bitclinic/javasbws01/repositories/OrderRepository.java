package pt.bitclinic.javasbws01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.bitclinic.javasbws01.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
