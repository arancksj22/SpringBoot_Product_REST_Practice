package com.example.DemoApp.service;
import com.example.DemoApp.model.Product;
import com.example.DemoApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {



    ProductRepo repo;

    @Autowired
    public ProductService(ProductRepo repo){
        this.repo = repo;
    }
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "iphone", 5000),
//            new Product(102, "android", 2500),
//            new Product(103, "sdads phone", 4300)));

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId){
       return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod){
        repo.save(prod);
    }

    public void deleteProduct(int prodId){
        int index = 0;
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getProdId() == prodId){
                index = i;
            }
        }
        products.remove(index);
    }
}
