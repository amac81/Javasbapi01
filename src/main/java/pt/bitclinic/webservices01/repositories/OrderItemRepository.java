package pt.bitclinic.webservices01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.bitclinic.webservices01.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
