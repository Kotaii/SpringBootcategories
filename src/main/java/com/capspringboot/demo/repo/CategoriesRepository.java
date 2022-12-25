package com.capspringboot.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capspringboot.demo.model.Categories;

@Repository
public interface CategoriesRepository extends CrudRepository<Categories, Integer>{

}
