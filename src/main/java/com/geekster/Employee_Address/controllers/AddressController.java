package com.geekster.Employee_Address.controllers;

import com.geekster.Employee_Address.models.Address;
import com.geekster.Employee_Address.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/addresses")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping
    public ResponseEntity<List<Address>> getAllAddress(){
        return addressService.getAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Address> getAddress(@PathVariable int id){
        return addressService.getAddress(id);
    }

    @PostMapping
    public String addAddress(@Valid @RequestBody Address address){
        return addressService.addAddress(address);
    }

    @PutMapping(value = "/{id}")
    public String updateAddress(@PathVariable int id,@Valid @RequestBody Address address){
        return addressService.updateAddress(id,address);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteAddress(@PathVariable int id){
        return addressService.removeAddress(id);
    }

}
