package pt.bitclinic.webservices01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.bitclinic.webservices01.entities.Payment;


public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
