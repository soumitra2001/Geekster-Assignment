package com.geekster.EcommerceAPI.controllers;

import com.geekster.EcommerceAPI.models.UserOrder;
import com.geekster.EcommerceAPI.services.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/orders")
public class UserOrderController {

    @Autowired
    UserOrderService orderService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserOrder> getOrder(int id){
        return orderService.getOrderById(id);
    }

    @PostMapping(value = "/order")
    public String addOrder(@Valid @RequestBody UserOrder order){
        return orderService.addOrder(order);
    }

}
