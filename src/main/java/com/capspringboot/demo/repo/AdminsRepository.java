package com.capspringboot.demo.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capspringboot.demo.model.Admins;

@Repository
	public interface AdminsRepository extends CrudRepository<Admins, Integer> {
		public Optional<Admins> findByEmailAndPassword(String email, String password);
	}

