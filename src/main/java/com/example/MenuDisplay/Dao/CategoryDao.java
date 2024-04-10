package com.example.MenuDisplay.Dao;

import com.example.MenuDisplay.entity.Category;

import java.util.List;

public interface CategoryDao {




    List<Category> findByParentIdIsNull();

    List<Category> findByParentId(Integer id);
}
