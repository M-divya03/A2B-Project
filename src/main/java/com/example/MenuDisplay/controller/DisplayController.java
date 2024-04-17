package com.example.MenuDisplay.controller;

import com.example.MenuDisplay.entity.Category;
import com.example.MenuDisplay.entity.Items;
import com.example.MenuDisplay.service.CategoryService;
import com.example.MenuDisplay.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.*;

@RestController
@RequestMapping("/home")
@CrossOrigin("*")
public class DisplayController {



    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ItemsService itemsService;

    @GetMapping("/menu")
    public List<Map<String, Object>> getMenu() {
        List<Category> parentCategories = categoryService.findByParentIdIsNull();
        List<Map<String, Object>> menu = new ArrayList<>();

        for (Category parentCategory : parentCategories) {
            Map<String, Object> parentCategoryMap = mapCategory(parentCategory);
            menu.add(parentCategoryMap);
        }

        return menu;
    }

    private Map<String, Object> mapCategory(Category category) {
        Map<String, Object> categoryMap = new HashMap<>();
        categoryMap.put("id", category.getId());
        categoryMap.put("name", category.getName());
        categoryMap.put("parentId", category.getParentId());
        categoryMap.put("imageUrl",category.getImageUrl());
        List<Category> subcategories = categoryService.findByParentId(category.getId());
        List<Map<String, Object>> subcategoryMaps = new ArrayList<>();

        for (Category subcategory : subcategories) {
            Map<String, Object> subcategoryMap = mapCategory(subcategory);

            List<Items> items = subcategory.getItems();
            List<Map<String, Object>> itemMaps = new ArrayList<>();
            for (Items item : items) {
                Map<String, Object> itemMap = new HashMap<>();
                itemMap.put("id", item.getItemId());
                itemMap.put("name", item.getItemName());
                itemMap.put("rate",item.getItem_rate());
                itemMap.put("description",item.getDescription());
                itemMap.put("attribute",item.getAttribute());
                itemMaps.add(itemMap);
            }

            subcategoryMap.put("items", itemMaps);
            subcategoryMaps.add(subcategoryMap);
        }

        categoryMap.put("subcategories", subcategoryMaps);
        return categoryMap;
    }



}
