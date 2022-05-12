package cz.springframework.czrecipeapp.repositories;

import cz.springframework.czrecipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
