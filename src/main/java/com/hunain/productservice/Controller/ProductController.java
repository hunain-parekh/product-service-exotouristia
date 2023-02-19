package com.hunain.productservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hunain.productservice.Classes.SearchCriteria;
import com.hunain.productservice.Model.Product;
import com.hunain.productservice.Repository.IProductRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private IProductRepository productRepo;

    @PostMapping("/search")
    public List<Product> SearchProductWithSearchCriteria(@RequestBody SearchCriteria search){
        if(search.getPoolRequired() != null && search.getPoolRequired()){
            return productRepo.findByLocationAndExperienceAndIsPool(search.getLocation(),search.getExperience(),search.getPoolRequired());
        }
        else{
            return productRepo.findByLocationAndExperience(search.getLocation(),search.getExperience());
        }   
    }

    @PostMapping
    public void saveProduct(@RequestBody Product product){
        productRepo.save(product);
    }
}
