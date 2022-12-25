package com.capspringboot.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capspringboot.demo.model.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer>{
	 public List<Cart> findAllProductsByUserId(Integer userId);
}
