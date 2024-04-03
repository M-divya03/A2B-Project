package com.example.MenuDisplay.service;

import com.example.MenuDisplay.entity.Category;
import com.example.MenuDisplay.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ItemsService itemsService;

    public List<Category> getAllCategoryWithItems() {
        return categoryRepo.findAll();
    }
 /* public List<List<Category>> getAllCategory() {
        List<List<Category>> AllCategory = new ArrayList<>();
        List<Category> categories=categoryRepo.findAll();
        System.out.println(categories);
       for(Category category:categories) {
           List<Category> categoryWithItems = new ArrayList<>();
           categoryWithItems.add((Category) categories);
            if (category.getParentId() != null) {
                categoryWithItems.add(itemsService.getByCategoryId(((Category) categories).getParentId()));
            }else{
                categoryWithItems.add(null);
            }
           AllCategory.add(categoryWithItems);
        }
      //System.out.println(categories.getParentId());
        return AllCategory;
    }*/
}
