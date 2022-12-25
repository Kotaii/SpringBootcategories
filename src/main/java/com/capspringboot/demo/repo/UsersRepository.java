package com.capspringboot.demo.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capspringboot.demo.model.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users,Integer>{
 public Optional<Users> findByEmailAndPassword(String email, String password);


}
