package com.geekbrains.repositories;

import com.geekbrains.entities.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productsList;

    @PostConstruct
    private void init(){
        productsList = new ArrayList<>();
        productsList.add(new Product(1L, "TV", 25.99));
        productsList.add(new Product(2L, "Camera", 35.99));
        productsList.add(new Product(3L, "Phone", 15.99));
    }



    public Product getProductById(Long id){
        for (Product product : productsList) {
            if (product.getId().equals(id))
                return product;
        }
        return null;
    }

    public List<Product> getProductsList() {
        return productsList;
    }
}
