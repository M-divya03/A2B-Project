package com.example.MenuDisplay.Dao;

import com.example.MenuDisplay.entity.Items;
import com.example.MenuDisplay.entity.kot;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface KotDao {
    ResponseEntity<String> save(kot onekot);



    List<kot> findAll();
}
