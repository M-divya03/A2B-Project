package com.example.MenuDisplay.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class kot {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer kotId;
    private Integer diningId;
    private String itemName;
    private Integer quantity;

}
