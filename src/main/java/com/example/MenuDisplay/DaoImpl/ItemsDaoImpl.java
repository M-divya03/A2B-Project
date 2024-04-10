package com.example.MenuDisplay.DaoImpl;

import com.example.MenuDisplay.Dao.ItemsDao;
import com.example.MenuDisplay.entity.Category;
import com.example.MenuDisplay.entity.Items;
import com.example.MenuDisplay.repo.ItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemsDaoImpl implements ItemsDao {

    @Autowired
    private ItemsRepo itemsRepo;

    public List<Items> findAll(){
        return itemsRepo.findAll();
    }

    public Category findByCategoryId(Integer parentId){
        return itemsRepo.findByCategoryId(parentId);
    }

    public  List<Items> findItemsByCategoryId(Integer id){
        return (List<Items>) itemsRepo.findByCategoryId(id);
    }
}
