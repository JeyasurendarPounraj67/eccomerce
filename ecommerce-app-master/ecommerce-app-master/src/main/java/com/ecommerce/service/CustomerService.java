package com.ecommerce.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.model.Item;

import java.util.List;

public interface CustomerService extends JpaRepository<Item,Integer> {
	List<Item> getItemById(String flightId);

	List<Item> getAllItems();
}
