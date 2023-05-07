package com.geekster.Employee_Address.services;

import com.geekster.Employee_Address.models.Address;
import com.geekster.Employee_Address.models.Employee;
import com.geekster.Employee_Address.repositories.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    private List<Address> allAddress;

    public ResponseEntity<List<Address>> getAll(){
        allAddress=(List<Address>) addressRepo.findAll();
        if(allAddress.size()>0) {
            return new ResponseEntity<>((List<Address>) addressRepo.findAll(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<Address> getAddress(int id){
        allAddress = getAll().getBody();
        for(Address address:allAddress){
            if(address.getAddress_id().equals(id)){
                return new ResponseEntity<>(address,HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
    }

    public String addAddress(Address address){
        if(address!=null){
            addressRepo.save(address);
            return "Address saved successfully...!";
        }
        return "Invalid user input..!";
    }

    public String updateAddress(int id,Address address){
        allAddress = getAll().getBody();
        for(Address address1:allAddress){
            if(address1.getAddress_id().equals(id)){
                addressRepo.save(address);
                return "Address updated successfully...!";
            }
        }
        return "Invalid user input...!";
    }

    public String removeAddress(int id){
        allAddress = getAll().getBody();
        for(Address address:allAddress){
            if(address.getAddress_id().equals(id)){
                addressRepo.deleteById(id);
                return "Address deleted successfully...!";
            }
        }
        return "Invalid user input...!";
    }

}
