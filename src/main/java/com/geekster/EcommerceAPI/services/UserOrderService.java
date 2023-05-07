package com.geekster.EcommerceAPI.services;

import com.geekster.EcommerceAPI.Repositories.IUserOrderDao;
import com.geekster.EcommerceAPI.models.UserOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class UserOrderService {

    @Autowired
    IUserOrderDao orderDao;

    public String addOrder(UserOrder order){
        if(order!=null){
            orderDao.save(order);
            return "Your order successfully added...!";
        }
        return "Invalid user input...!";
    }

    public ResponseEntity<UserOrder> getOrderById(int id){
        List<UserOrder> orders=(List<UserOrder>) orderDao.findAll();

        for(UserOrder order:orders){
            if(order.getOrderId().equals(id)){
                return new ResponseEntity<>(order, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
    }
}
