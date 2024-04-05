package com.example.MenuDisplay.service;

import com.example.MenuDisplay.entity.Category;
import com.example.MenuDisplay.entity.Items;
import com.example.MenuDisplay.repo.ItemsRepo;
import com.example.MenuDisplay.serviceImpl.ItemsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemsService {

    List<Items> getAllItems();
    Category getByCategoryId(Integer parentId);


}
