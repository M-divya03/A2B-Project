package com.example.MenuDisplay.repo;


import com.example.MenuDisplay.entity.kot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KotRepo extends JpaRepository<kot,Integer> {

}
