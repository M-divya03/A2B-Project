package com.example.MenuDisplay.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemId;
    private String itemName;
    private Integer item_rate;
    private String description;

    private String attribute;

    @ManyToOne
    @JsonBackReference
    private Category category;

}
