package com.example.MenuDisplay.serviceImpl;

import com.example.MenuDisplay.Dao.ItemsDao;
import com.example.MenuDisplay.entity.Category;
import com.example.MenuDisplay.entity.Items;
import com.example.MenuDisplay.repo.ItemsRepo;
import com.example.MenuDisplay.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;
    public List<Items> getAllItems() {

        return itemsDao.findAll();
    }

    public Category getByCategoryId(Integer parentId) {
        return  itemsDao.findByCategoryId(parentId);
    }
   public List<Items> getItemsForCategory(Integer id){

        return itemsDao.findItemsByCategoryId(id);
   }
}
