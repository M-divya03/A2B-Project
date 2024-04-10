package com.example.MenuDisplay.Dao;

import com.example.MenuDisplay.entity.Category;
import com.example.MenuDisplay.entity.Items;

import java.util.List;

public interface ItemsDao {
    List<Items> findAll();

    Category findByCategoryId(Integer parentId);
    List<Items> findItemsByCategoryId(Integer id);
}
