package com.geekster.EcommerceAPI.services;

import com.geekster.EcommerceAPI.Repositories.IProductDao;
import com.geekster.EcommerceAPI.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductDao productRepo;

    private List<Product> products;

    public ResponseEntity<List<Product>> getAll(){
        return new ResponseEntity<>((List<Product>) (productRepo.findAll()),HttpStatus.OK);
    }

    public ResponseEntity<Product> getProductByCategory(String category){
        products=getAll().getBody();
        for(Product product:products){
            if(product.getProductCategory().equals(category)){
                return new ResponseEntity<>(product, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
    }

    public String deleteProduct(int id){
        products=getAll().getBody();
        for(Product product:products){
            if(product.getProductId().equals(id)){
                productRepo.deleteById(id);
                return "Product deleted...!";
            }
        }
        return "Invalid Product_Id...!";
    }

    public String addProduct(Product product){
        if(product!=null){
            productRepo.save(product);
            return "Product added successfully...!";
        }
        return "Invalid user input...!";
    }

}
