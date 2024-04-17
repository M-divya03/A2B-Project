package com.example.MenuDisplay.controller;


import com.example.MenuDisplay.entity.Items;
import com.example.MenuDisplay.entity.kot;
import com.example.MenuDisplay.service.KotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class KotController {

    @Autowired
    private KotService kotService;
    @PostMapping("/neworder")
    public ResponseEntity<String> saveOrders(@RequestBody List<kot> kot){
        return kotService.saveKot(kot);

    }

    @GetMapping("/getKot")
    public List<kot> getItemsFromKot(){
        return kotService.getItemsFromKot();

    }

  
}
