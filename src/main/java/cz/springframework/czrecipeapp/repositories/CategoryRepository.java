package cz.springframework.czrecipeapp.repositories;

import cz.springframework.czrecipeapp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
