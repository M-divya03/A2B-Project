package com.example.MenuDisplay.Dao;

import com.example.MenuDisplay.entity.kot;
import org.springframework.http.ResponseEntity;

public interface KotDao {
    ResponseEntity<String> save(kot onekot);
}
