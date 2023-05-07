package com.geekster.EcommerceAPI.services;

import com.geekster.EcommerceAPI.Repositories.IUserDao;
import com.geekster.EcommerceAPI.models.Product;
import com.geekster.EcommerceAPI.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserDao userRepo;

    private List<User> users;

    public List<User> getAll(){
        return (List<User>) userRepo.findAll();
    }

    public ResponseEntity<User> getUserById(int id){
        users=getAll();
        for(User user:users){
            if(user.getUserId().equals(id)){
                return new ResponseEntity<>(user, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
    }

    public String addUser(User user){
        if(user!=null){
            user.getUserAddress().setAddressUserId(user);
            userRepo.save(user);
            return "User added successfully...!";
        }
        return "Invalid user input...!";
    }

}
