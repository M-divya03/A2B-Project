package com.example.MenuDisplay.service;

import com.example.MenuDisplay.entity.Category;
import com.example.MenuDisplay.entity.Items;
import com.example.MenuDisplay.repo.ItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsService {

    @Autowired
    private ItemsRepo itemsRepo;
    public List<Items> getAllItems() {
        return itemsRepo.findAll();
    }

    public Category getByCategoryId(Integer parentId) {
       return  itemsRepo.findByCategoryId(parentId);
    }
}
