package com.example.MenuDisplay.serviceImpl;

import com.example.MenuDisplay.Dao.KotDao;
import com.example.MenuDisplay.entity.kot;
import com.example.MenuDisplay.repo.KotRepo;
import com.example.MenuDisplay.service.KotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KotServiceImpl implements KotService {
    @Autowired
    private KotDao kotDao;

    @Override
    public ResponseEntity<String> toCart() {
        return null;
    }

    public ResponseEntity<String> saveKot(List<kot> kot) {
        for(kot onekot:kot)
           kotDao.save(onekot);
        return null;
    }
}
