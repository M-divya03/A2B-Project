package com.example.MenuDisplay.repo;

import com.example.MenuDisplay.entity.Category;
import com.example.MenuDisplay.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepo extends JpaRepository<Items,Integer> {
    Category findByCategoryId(Integer parentId);
}
