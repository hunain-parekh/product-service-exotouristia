package com.hunain.productservice.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private String name;
    @Setter
    private String shortDesc;
    @Setter
    private String longDesc;
    @Setter
    private String imageLink;
    @Setter
    private String location;
    @Setter
    private String experience;
    @Setter
    private Boolean isPool;
    @Setter
    private Integer price;
}
