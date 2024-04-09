package com.example.MenuDisplay.DaoImpl;

import com.example.MenuDisplay.Dao.KotDao;
import com.example.MenuDisplay.entity.kot;
import com.example.MenuDisplay.repo.KotRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class KotDaoImpl implements KotDao {

    @Autowired
    private KotRepo kotRepo;

    public ResponseEntity<String> save(kot oneKot){
        kotRepo.save(oneKot);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
