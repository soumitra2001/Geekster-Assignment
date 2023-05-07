package com.geekster.EcommerceAPI.controllers;

import com.geekster.EcommerceAPI.models.Product;
import com.geekster.EcommerceAPI.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    ProductService itemService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProduct(){
        return itemService.getAll();
    }

    @GetMapping(value = "/{category}")
    public ResponseEntity<Product> getByCategory(@PathVariable String category){
        return itemService.getProductByCategory(category);
    }

    @DeleteMapping(value = "/{id}")
    public String getById(@PathVariable int id){
        return itemService.deleteProduct(id);
    }

    @PostMapping(value = "product")
    public String addProduct(@Valid @RequestBody Product product){
        return itemService.addProduct(product);
    }

}
