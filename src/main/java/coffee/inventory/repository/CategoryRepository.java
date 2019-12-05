package coffee.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import coffee.inventory.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}