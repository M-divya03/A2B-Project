package com.example.MenuDisplay.DaoImpl;

import com.example.MenuDisplay.Dao.KotDao;
import com.example.MenuDisplay.entity.kot;
import com.example.MenuDisplay.repo.KotRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class KotDaoImpl implements KotDao {

    @Autowired
    private KotRepo kotRepo;

    public void save(kot oneKot){
        kotRepo.save(oneKot);
    }
}
