package com.capspringboot.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capspringboot.demo.model.Categories;
import com.capspringboot.demo.model.Response;
import com.capspringboot.demo.repo.CategoriesRepository;

	@RestController
	@CrossOrigin(origins = {"http://localhost:4200"})
	@RequestMapping("/categories")
	public class CategoriesController {
	  @Autowired
		CategoriesRepository repository;
		
		final String TAG = "Categories";
		
		@PostMapping(path= "/add")
		public Response<Categories> addCategories(@RequestParam(value = "categoryId", required = false)Integer categoryId, @RequestParam String categoryTitle, @RequestParam String categoryDescription, @RequestParam String categoryImageUrl, @RequestParam Integer active, @RequestParam Date addedOn) {
			Date date = new Date();
			
			Categories category = new Categories(null, categoryTitle, categoryDescription, categoryImageUrl, active, addedOn);
			repository.save(category);
			
			return new Response<Categories>(101, TAG+" Saved Successfully at "+date, Arrays.asList(category));
		}
		
		@GetMapping(path="/get")
		public Response<Categories> getAllCategories(){
			
			ArrayList<Categories> categories = new ArrayList<>();
			repository.findAll().forEach((category) -> categories.add(category));
			
			Date date = new Date();
			return new Response<Categories>(101, categories.size()+" "+TAG+"s retrieved successfully at "+date, categories);
			
}

	

	@GetMapping(path = "/get/{id}")
	public Response<Categories> getCategoryById(@PathVariable("id") Integer id){
		
		ArrayList<Categories> list = new ArrayList<>();
		Categories category = repository.findById(id).get();
		list.add(category);
		
		Date date = new Date();
		return new Response<Categories>(101, TAG+" Fetched Successfully at "+date, list);
		
	}
	
	@PostMapping(path= "/update")
	public Response<Categories> updateCategory(@RequestParam Integer categoryId, @RequestParam String categoryTitle, @RequestParam String categoryDescription, @RequestParam String categoryImageUrl,	@RequestParam Integer active) {

Date date = new Date();
		
		Categories category = new Categories(categoryId, categoryTitle, categoryDescription, categoryImageUrl, active, date);
		repository.save(category);
		
		return new Response<Categories>(101, TAG+" Updated Successfully at "+date, null);
		
	}
	
	@GetMapping(path = "/delete/{id}")
	public Response<Categories> deleteCategory(@PathVariable("id") Integer id){
		
		Categories category = new Categories();
		category.setCategoryId(id);
		repository.delete(category);
		
		Date date = new Date();
		return new Response<Categories>(101, TAG+" Deleted Successfully at "+date, null);
		
	}
}

