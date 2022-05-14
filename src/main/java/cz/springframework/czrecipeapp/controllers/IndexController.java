package cz.springframework.czrecipeapp.controllers;

import cz.springframework.czrecipeapp.model.Category;
import cz.springframework.czrecipeapp.model.UnitOfMeasure;
import cz.springframework.czrecipeapp.repositories.CategoryRepository;
import cz.springframework.czrecipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","index","index.html"})
    public String index(){

        Optional<Category> optionalCategory = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> optionalUnitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category: " + optionalCategory.get().getId());
        System.out.println("Unit: " + optionalUnitOfMeasure.get().getId());

        return "index";
    }

}
