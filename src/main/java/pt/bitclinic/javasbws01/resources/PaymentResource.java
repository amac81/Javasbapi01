package pt.bitclinic.javasbws01.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.bitclinic.javasbws01.entities.Payment;
import pt.bitclinic.javasbws01.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

	@Autowired
	private PaymentService paymentService;

	@GetMapping
	public ResponseEntity<List<Payment>> findAll() {
		List<Payment> paymentList = paymentService.findAll();
		return ResponseEntity.ok().body(paymentList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Payment> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(paymentService.findById(id));
	}

	//TODO PaymentResource: @PostMapping insert, @DeleteMapping delete, @PutMapping update
}
