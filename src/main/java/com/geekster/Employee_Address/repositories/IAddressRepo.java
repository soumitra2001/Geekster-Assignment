package com.geekster.Employee_Address.repositories;

import com.geekster.Employee_Address.models.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Integer> {

}
