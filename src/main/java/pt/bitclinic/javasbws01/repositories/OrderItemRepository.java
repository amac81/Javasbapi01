package pt.bitclinic.javasbws01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.bitclinic.javasbws01.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
