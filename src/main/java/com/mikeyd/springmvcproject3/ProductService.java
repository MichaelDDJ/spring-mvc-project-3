package com.mikeyd.springmvcproject3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class ProductService {

    @Autowired
    ProductDB db;

    public void show() {
        System.out.println("in show");
    }

    public void addProduct(Product p){

        //products.add(p);

        db.save(p);
    }

    public List<Product> getAllProducts() {

        return db.findAll();
    }

    public Product getProductByName(String name) {
        return db.findByName(name);
    }



    /*public List<Product> getProductsInWarranty(){
        List<Product> prods = new ArrayList<>();

        for (Product p : products) {
            if(p.getWarranty() >= Year.now().getValue()) {
                prods.add(p);
            }
        }
        return prods;
    }*/
}
