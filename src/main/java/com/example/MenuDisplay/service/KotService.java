package com.example.MenuDisplay.service;


import com.example.MenuDisplay.entity.kot;
import com.example.MenuDisplay.repo.KotRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KotService {
    @Autowired
    private KotRepo kotRepo;

    public ResponseEntity<String> saveKot(List<kot> kot) {
        for(kot onekot:kot)
            kotRepo.save(onekot);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
