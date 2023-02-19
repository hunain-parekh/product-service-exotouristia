package com.hunain.productservice.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hunain.productservice.Model.Product;

public interface IProductRepository extends JpaRepository<Product,Long>{
    public List<Product> findByLocationAndExperienceAndIsPool(String location,String experience,Boolean isPool);
    public List<Product> findByLocationAndExperience(String location,String experience);
}
