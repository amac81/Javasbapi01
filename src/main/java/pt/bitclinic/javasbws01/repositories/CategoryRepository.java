package pt.bitclinic.javasbws01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.bitclinic.javasbws01.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
