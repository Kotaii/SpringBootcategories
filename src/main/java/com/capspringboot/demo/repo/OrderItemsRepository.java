package com.capspringboot.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capspringboot.demo.model.OrderItems;

@Repository
	public interface OrderItemsRepository extends CrudRepository<OrderItems, Integer> {
		
		public List<OrderItems> findByOrderId(Integer orderId);
	}

