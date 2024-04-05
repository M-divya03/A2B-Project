package com.example.MenuDisplay.serviceImpl;

import com.example.MenuDisplay.Dao.CategoryDao;
import com.example.MenuDisplay.entity.Category;
import com.example.MenuDisplay.repo.CategoryRepo;
import com.example.MenuDisplay.service.CategoryService;
import com.example.MenuDisplay.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;




    public List<Category> getAllCategoryWithItems(){
        return categoryDao.findAll();
    }


}
