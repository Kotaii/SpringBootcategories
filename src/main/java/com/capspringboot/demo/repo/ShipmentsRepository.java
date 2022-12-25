package com.capspringboot.demo.repo;


	import java.util.List;

	import org.springframework.data.repository.CrudRepository;
	import org.springframework.stereotype.Repository;

import com.capspringboot.demo.model.Shipments;

	

	@Repository
	public interface ShipmentsRepository extends CrudRepository<Shipments, Integer> {
		public List<Shipments> findByShipmentStatus(Integer shipmentStatus);
	}

