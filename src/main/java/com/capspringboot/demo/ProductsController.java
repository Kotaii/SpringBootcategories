package com.capspringboot.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capspringboot.demo.model.Categories;
import com.capspringboot.demo.model.Response;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/products")
public class ProductsController {
     
	@Autowired
	
	ProductsRepository repository;
	
	final string TAG = "Product";
	
	@PostMapping(path= "/add")
	public Response<Products> addProduct(@RequestParam String ProductTitle, @RequestParam String ProductDescription, @RequestParam
		@RequestParam List<String> images, @RequestParam Integer categoryId, @RequestParam Integer ThumbnailImage, @RequestParam
        Date date = new Date();
	
	    Products product=new Products(null,productTitle, productDescription, productCode, images, categoryId, ThumbnailImage)
	    repository.save(product);
	    
	    return new Response<Products>(101, TAG+" Saved Successfully at "+date, Arrays.asList(product));
}
