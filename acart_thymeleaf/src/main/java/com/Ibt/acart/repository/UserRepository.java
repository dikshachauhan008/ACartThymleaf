package com.Ibt.acart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Ibt.acart.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{

}
