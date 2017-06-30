package com.srinu.chaitanya.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinu.chaitanya.Model.OrderItems;
import com.srinu.chaitanya.Repository.BookRepository;
import com.srinu.chaitanya.Repository.OrderItemsRepository;

@Service
public class OrderItemsService {
	@Autowired
	public OrderItemsRepository orderitemsrepository;
	@Autowired
	public BookRepository bookRepository;

	public OrderItems save(OrderItems orderitems) {
		return orderitemsrepository.save(orderitems);
	}
}