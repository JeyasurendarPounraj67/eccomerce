package com.ecommerce.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface ItemRepository extends JpaRepository<Item, String> {
	
	List<Item> findByDepartureAndDepartureDateGreaterThan(String departure, LocalDateTime departureDate);
}
