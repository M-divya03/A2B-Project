package com.example.MenuDisplay.DaoImpl;

import com.example.MenuDisplay.Dao.CategoryDao;
import com.example.MenuDisplay.entity.Category;
import com.example.MenuDisplay.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private CategoryRepo categoryRepo;


   public List<Category> findAll(){
    return categoryRepo.findAll();
   }

    public List<Category> findByParentIdIsNull(){
       return categoryRepo.findByParentIdIsNull();
    }
    public List<Category> findByParentId(Integer id){
       return categoryRepo.findByParentId(id);
    }


}
