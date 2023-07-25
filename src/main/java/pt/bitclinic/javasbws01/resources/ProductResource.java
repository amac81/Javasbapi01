package pt.bitclinic.javasbws01.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import pt.bitclinic.javasbws01.entities.Product;
import pt.bitclinic.javasbws01.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> ProductList = productService.findAll();
		return ResponseEntity.ok().body(ProductList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(productService.findById(id));
	}
		
	@PostMapping
	public ResponseEntity<Product> insert(@RequestBody Product obj) {
		obj = productService.insert(obj);
		// to generate the correct HTTP response code 201 - Created
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/products/{id}").buildAndExpand(obj.getId())
				.toUri();
		return ResponseEntity.created(uri).body(obj);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		productService.delete(id);
		// generate HTTP response code 204 - No Content
		return ResponseEntity.noContent().build();
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody Product obj) {
		obj = productService.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}


}
