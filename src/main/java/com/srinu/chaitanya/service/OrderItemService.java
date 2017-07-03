package com.srinu.chaitanya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinu.chaitanya.model.OrderItem;
import com.srinu.chaitanya.repository.OrderItemRepository;



@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public void save(OrderItem orderItem) {
		orderItemRepository.save(orderItem);
	}
}
