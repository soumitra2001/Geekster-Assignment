package com.geekster.Employee_Address.services;

import com.geekster.Employee_Address.models.Employee;
import com.geekster.Employee_Address.repositories.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public Iterable<Employee> getAll(){
        return addressRepo.findAll();
    }
}
