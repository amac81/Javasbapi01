package pt.bitclinic.webservices01.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.bitclinic.webservices01.entities.Category;
import pt.bitclinic.webservices01.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService CategoryService;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> CategoryList = CategoryService.findAll();
		return ResponseEntity.ok().body(CategoryList);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(CategoryService.findById(id));
	}
	
	//TODO CategoryResource: @PostMapping insert, @DeleteMapping delete, @PutMapping update

}
