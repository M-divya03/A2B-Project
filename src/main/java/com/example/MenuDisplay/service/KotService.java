package com.example.MenuDisplay.service;


import com.example.MenuDisplay.entity.Items;
import com.example.MenuDisplay.entity.kot;
import com.example.MenuDisplay.repo.KotRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;



public interface KotService {
    List<kot> getItemsFromKot() ;


    ResponseEntity<String> saveKot(List<kot> kot);


}
