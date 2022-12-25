package com.capspringboot.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capspringboot.demo.model.Admins;
import com.capspringboot.demo.model.Response;
import com.capspringboot.demo.repo.AdminsRepository;


    @RestController
    @CrossOrigin(origins = {"http://localhost:4200"})
	@RequestMapping("/adminauth")
	public class AdminAuthController {

		@Autowired
		AdminsRepository repository;
		
		final String TAG = "Admin";
		
		@PostMapping(path= "/login")
		public Response<Admins> loginAdmin(@RequestParam String email, @RequestParam String password) {

			Date date = new Date();
			
			Admins admin = repository.findByEmailAndPassword(email, password).get();
			if(!admin.getFullName().isEmpty()) {
				return new Response<Admins>(101, TAG+" Logged In Successfully at "+date, null);
			}else {
				return new Response<Admins>(201, TAG+" Authentication Failed at "+date, null);
			}
			
		}
		

}
