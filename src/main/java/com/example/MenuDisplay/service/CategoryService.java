package com.example.MenuDisplay.service;

import com.example.MenuDisplay.entity.Category;
import com.example.MenuDisplay.repo.CategoryRepo;
import com.example.MenuDisplay.serviceImpl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {


     List<Category> getAllCategoryWithItems();

}
