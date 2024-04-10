package com.example.MenuDisplay.repo;

import com.example.MenuDisplay.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer> {
    List<Category> findByParentIdIsNull();

    List<Category> findByParentId(Integer id);
}
