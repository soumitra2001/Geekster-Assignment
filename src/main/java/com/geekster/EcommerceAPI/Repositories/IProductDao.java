package com.geekster.EcommerceAPI.Repositories;

import com.geekster.EcommerceAPI.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDao extends CrudRepository<Product,Integer> {

}
