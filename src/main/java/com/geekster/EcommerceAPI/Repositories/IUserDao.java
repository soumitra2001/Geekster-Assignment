package com.geekster.EcommerceAPI.Repositories;

import com.geekster.EcommerceAPI.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends CrudRepository<User,Integer> {

}
