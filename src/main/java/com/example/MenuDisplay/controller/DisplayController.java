package com.example.MenuDisplay.controller;

import com.example.MenuDisplay.entity.Category;
import com.example.MenuDisplay.entity.Items;
import com.example.MenuDisplay.service.CategoryService;
import com.example.MenuDisplay.service.ItemsService;
import com.example.MenuDisplay.serviceImpl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/home")
public class DisplayController {



    @Autowired
    private CategoryService categoryService;


   @GetMapping("/menu")
    public List<Category> getAllCategory(){

       return categoryService.getAllCategoryWithItems();
    }
}
