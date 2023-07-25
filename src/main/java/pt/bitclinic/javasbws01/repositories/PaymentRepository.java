package pt.bitclinic.javasbws01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.bitclinic.javasbws01.entities.Payment;


public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
