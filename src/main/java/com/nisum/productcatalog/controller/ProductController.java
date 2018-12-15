package com.nisum.productcatalog.controller;

import com.nisum.productcatalog.CustomException;
import com.nisum.productcatalog.data.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NIS1563-MBP on 12/14/18.
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<List<Product>> getProducts(){
        List<Product> products;
        products = new ArrayList<>();
        Product product1 = new Product();
        product1.setId(2);
        product1.setName("T-Shirt");

        Product product2 = new Product();
        product2.setId(1);
        product2.setName("Pants");
        products.add(product1);
        products.add(product2);
        //throw new CustomException("Message from custom exception.");

        return new ResponseEntity<>(products, HttpStatus.OK);

    }

}
