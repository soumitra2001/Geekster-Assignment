package com.geekster.EcommerceAPI.Repositories;

import com.geekster.EcommerceAPI.models.UserOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserOrderDao extends CrudRepository<UserOrder,Integer> {

}
